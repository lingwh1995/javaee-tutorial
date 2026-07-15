package org.bluebridge.designpattern.adapter_a;

/**
 * HTTP控制器
 *
 * @author lingwh
 * @date 2019/4/15 8:39
 */
public class HttpController implements Controller {

    public void doHttpHandler() {
        System.out.println("http...");
    }
}
