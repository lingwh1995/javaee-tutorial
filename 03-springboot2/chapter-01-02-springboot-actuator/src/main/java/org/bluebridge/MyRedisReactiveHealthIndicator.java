package org.bluebridge;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义 redis 组件监控返回信息
 *
 * 测试 url： http://localhost:8080/actuator/health
 *
 * @author lingwh
 * @date 2019/7/13 11:25
 */
@Component
public class MyRedisReactiveHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.down().withDetail("msg","Redis启动异常").build();
    }
}
