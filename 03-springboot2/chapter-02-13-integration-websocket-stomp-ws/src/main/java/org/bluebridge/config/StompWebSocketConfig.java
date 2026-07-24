package org.bluebridge.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.StompWebSocketEndpointRegistration;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import javax.annotation.Resource;
import java.net.URI;
import java.security.Principal;
import java.util.Map;

/**
 * WebSocket 配置类
 *
 * STOMP WebSocket 客户端特点
 * 协议支持：STOMP 是一个简单的文本消息协议，为 WebSocket 增加了语义层
 * 消息路由：支持基于目的地（destination）的消息路由机制
 * 订阅机制：客户端可以订阅特定的消息主题或队列
 *
 * @author lingwh
 * @date 2025/10/19 10:07
 */
@Slf4j
@Configuration
// 注解开启使用 STOMP 协议来传输基于代理(message broker)的消息，这时控制器支持使用 @MessageMapping，就像使用 @RequestMapping 一样
@EnableWebSocketMessageBroker
public class StompWebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Resource
    private WebSocketProperties webSocketProperties;

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        /**
         * 配置后端推送给前端路径前缀
         * 1. 用户可以订阅来自以"/topic", "/user"为前缀的消息，广播式应配置一个/topic 消息代理，点对点应配置一个/user 消息代理
         * 2. 必须和 controller 中的 @SendTo 配置的地址前缀一样或者全匹配
         * 3. 客户端只可以订阅这两个前缀的主题
         */
        config.enableSimpleBroker("/topic", "/user");

        /**
         * 配置前端发送消息给后端路径前缀
         *
         * 客户端发送过来的消息，需要以"/websocket-stomp-ws"为前缀，再经过 Broker 转发给响应的 Controller
         */
        config.setApplicationDestinationPrefixes(webSocketProperties.getEndpointPathPrefix());

        /**
         * 配置用户目的地前缀
         *
         * 点对点使用的订阅前缀（客户端订阅路径上会体现出来），不设置的话，默认也是/user/
         */
        config.setUserDestinationPrefix("/user");
    }

    /**
     * 原生 websocket 版
     *
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 路径"/websocket/{userId}"被注册为 STOMP 端点，对外暴露，客户端通过该路径接入 WebSocket 服务
        StompWebSocketEndpointRegistration registration = registry.addEndpoint(webSocketProperties.getEndpointPathPrefix() + "/{userId}")
                // 添加默认握手拦截器
                .setHandshakeHandler(defaultHandshakeHandler())
                .setAllowedOriginPatterns(webSocketProperties.getAllowedOrigins().toArray(new String[0]));
        if (webSocketProperties.isEnableSockjs()) {
            // 添加 SockJS 支持
            registration.withSockJS();
        }
    }

    @Bean
    public DefaultHandshakeHandler defaultHandshakeHandler() {
        return new DefaultHandshakeHandler() {
            @Override
            protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler,
                                              Map<String, Object> attributes) {
                // 获取完整的请求 URL（包含协议、域名、端口、路径、参数等）
                URI requestUri = request.getURI();
                // 获取请求 url
                String url = requestUri.toString();
                // 获取 userId
                int userIdStartIndex = url.indexOf(webSocketProperties.getEndpointPathPrefix()) + webSocketProperties.getEndpointPathPrefix().length() + 1;
                String userId = url.substring(userIdStartIndex, userIdStartIndex + 4);

                Principal principal = request.getPrincipal();
                if (principal == null && userId != null) {
                    // 创建基于 userId 信息的用户主体
                    principal = () -> userId;
                }
                return principal;
            }
        };
    }
}
