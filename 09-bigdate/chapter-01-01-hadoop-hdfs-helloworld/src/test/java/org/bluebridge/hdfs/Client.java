package org.bluebridge.hdfs;

import org.bluebridge.hdfs.service.HdfsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client {

    @Autowired
    private HdfsService hdfsService;

    /**
     * 测试创建目录
     */
    @Test
    public void testMkdir() throws Exception {
        hdfsService.mkdir("/test");
    }

    /**
     * 测试判断文件是否存在
     */
    @Test
    public void testExists() throws Exception {
        System.out.println(hdfsService.exists("/test"));
    }

    /**
     * 测试列出目录
     */
    @Test
    public void testListFiles() throws Exception {
        System.out.println(hdfsService.listFiles("/"));
    }
}
