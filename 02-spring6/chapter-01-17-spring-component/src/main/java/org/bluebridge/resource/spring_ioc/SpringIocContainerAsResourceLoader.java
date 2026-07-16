package org.bluebridge.resource.spring_ioc;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * 验证 Spring 的 IoC 容器自身就可以充当 ResourceLoader
 *
 * ResourceLoaderAware 接口实现类的实例将获得一个 ResourceLoader的引用，ResourceLoaderAware 接口也提供了一个 setResourceLoader() 方法，该方法将由 Spring 容器负责调用，Spring 容器会将一个 ResourceLoader 对象作为该方法的参数传入。
 * 如果把实现 ResourceLoaderAware 接口的 Bean 类部署在 Spring容器中，Spring 容器会将自身当成 ResourceLoader 作为 setResourceLoader()方法的参数传入。由于 ApplicationContext 的实现类都实现了ResourceLoader接口，Spring容器自身完全可作为ResorceLoader使用。
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class SpringIocContainerAsResourceLoader implements ResourceLoaderAware {
    // 注意:在配置文件中配置bean时，我们不会给这个属性赋值，这个属性的赋值由Spring容器自己完成
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    /**
     * 这个方法用于外部获取ResourceLoader的实例对象的引用
     * @return
     */
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
