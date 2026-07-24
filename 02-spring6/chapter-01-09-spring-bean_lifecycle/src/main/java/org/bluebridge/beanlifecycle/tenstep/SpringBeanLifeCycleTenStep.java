package org.bluebridge.beanlifecycle.tenstep;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Spring 中 Bean 的生命周期七步：
 *  第一步：实例化 Bean
 *  第二步：Bean 属性赋值
 *  第三步：执行 Bean 后处理器的 before 方法
 *  第四步：初始化 Bean
 *  第五步：执行 Bean 后处理器的 after 方法
 *  第六步：使用 Bean
 *  第七步：销毁 Bean
 *
 * @author lingwh
 * @date 2025/5/13 11:38
 */
public class SpringBeanLifeCycleTenStep implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private static final Logger logger = LogManager.getLogger(SpringBeanLifeCycleTenStep.class);

    private String description;

    public SpringBeanLifeCycleTenStep() {
        logger.info("第一步：实例化Bean...");
    }

    public void setDescription(String description) {
        logger.info("第二步：Bean属性赋值...");
        this.description = description;
    }


    /**
     * 初始化 Bean 的方法
     *      这个方法的方法名随意，但是需要在 spring 配置文件中配置
     */
    public void initBean() {
        logger.info("第四步：初始化Bean...");
    }

    /**
     * 销毁 Bean 的方法
     *      这个方法的方法名随意，但是需要在 spring 配置文件中配置，这个方法需要手动去关闭 Spring 容器，才会触发这个容器
     */
    public void destoryBean() {
        logger.info("第七步：销毁Bean...");
    }

    @Override
    public String toString() {
        return "SpringBeanLifeCycleSevenStep{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logger.info("点位1：BeanClassLoaderAware接口的setBeanClassLoader()方法执行了...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("点位1：BeanFactoryAware的setBeanFactory()方法执行了...");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("点位1：BeanNameAware接口的setBeanName()执行了...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("点位2：InitializingBean接口的afterPropertiesSet()执行了...");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("点位3：DisposableBean接口的destroy()执行了...");
    }
}