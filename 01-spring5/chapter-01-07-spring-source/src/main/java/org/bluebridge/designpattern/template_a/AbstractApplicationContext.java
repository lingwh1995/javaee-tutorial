package org.bluebridge.designpattern.template_a;

/**
 * 抽象应用上下文
 *
 * @author lingwh
 * @date 2019/4/15 14:18
 */
public abstract class AbstractApplicationContext implements ConfigurableApplicationContext {

    @Override
    public void refresh() throws IllegalStateException {
        prepareRefresh();
        //实际上调用了抽象方法
        obtainFreshBeanFactory();
        prepareBeanFactory();
    }

    protected void obtainFreshBeanFactory() {
        refreshBeanFactory();
    }

    protected abstract void refreshBeanFactory() throws IllegalStateException;

    protected void prepareRefresh() {

    }

    protected void prepareBeanFactory() {

    }
}
