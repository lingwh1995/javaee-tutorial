package org.bluebridge;

import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * MultiValueMap 测试类
 *
 * @author lingwh
 * @date 2019/11/15 15:04
 */
public class MultiValueMapTest {

    @Test
    public void fun() {
        MultiValueMap param = new LinkedMultiValueMap();
        param.add("k1", "v1");
        param.add("k2", "v2");
        param.add("k2", "v2v2");
        param.add("k3", "v3");
        System.out.println(param);
    }
}
