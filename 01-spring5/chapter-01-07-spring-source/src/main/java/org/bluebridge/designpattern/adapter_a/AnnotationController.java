package org.bluebridge.designpattern.adapter_a;

/**
 * 注解控制器
 *
 * @author lingwh
 * @date 2019/4/15 8:42
 */
public class AnnotationController implements Controller {

    public void doAnnotationHandler() {
        System.out.println("annotation...");
    }
}
