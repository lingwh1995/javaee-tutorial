package org.bulebridge.domain;

/**
 * 用户实体类
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class User {

    private String id;
    private String dataType;

    public User() {
    }

    public User(String id, String dataType) {
        this.id = id;
        this.dataType = dataType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", dataType='" + dataType + '\'' +
                '}';
    }
}
