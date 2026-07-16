package org.bluebridge.ioc.condition.condition_b.componment;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 随机整数条件判断
 *
 * @author lingwh
 * @date 2019/4/8 14:23
 */
public class RandIntCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
