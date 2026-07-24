package org.bluebridge.config;

import org.bluebridge.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * 自定义 RedisTempalte
 *
 * @author lingwh
 * @date 2019/11/14 11:30
 */

@Configuration
public class ApplicationConfig {

    /**
     * 自定义 RedisTempalte，这个 RedisTempate 有自动将对象转换为 Json 格式字符串的功能+
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<Object, User> userRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, User> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // 设置默认的 Json 处理器，支持的 Json 处理器请查看 RedisSerializer 这个接口
            // 如果不设置，Json 转换使用的是 JdkSerializationRedisSerializer
        Jackson2JsonRedisSerializer<User> serializer = new Jackson2JsonRedisSerializer(User.class);
        redisTemplate.setDefaultSerializer(serializer);
        return redisTemplate;
    }
}
