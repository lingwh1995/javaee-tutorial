package org.bluebridge.hdfs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HDFS 配置属性
 */
@ConfigurationProperties(prefix = "hdfs")
public class HdfsProperties {

    /**
     * HDFS 地址
     */
    private String uri = "hdfs://localhost:9000";

    /**
     * HDFS 用户
     */
    private String user = "hadoop";

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
