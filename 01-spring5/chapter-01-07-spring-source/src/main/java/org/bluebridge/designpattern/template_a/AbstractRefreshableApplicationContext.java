package org.bluebridge.designpattern.template_a;

/**
 * 抽象可刷新的应用上下文
 *
 * @author lingwh
 * @date 2019/4/15 14:26
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    @Override
    protected final void refreshBeanFactory() {
        System.out.println("实现了父类的方法.....");
    }
}
