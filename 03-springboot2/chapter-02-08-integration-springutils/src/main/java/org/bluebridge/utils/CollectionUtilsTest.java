package org.bluebridge.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合工具类测试
 *
 * @author lingwh
 * @date 2025/7/1 14:56
 */
@Slf4j
public class CollectionUtilsTest {

    /**
     * 测试集合是否为空
     */
    @Test
    public void tetsIsEmpty() {
        List<Integer> list = new ArrayList<>();
        if (CollectionUtils.isEmpty(list)) {
            log.info("list is empty");
        }
    }
}
