package org.bluebridge.domain;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author lingwh
 * @date 2025/11/23 13:04
 */
@Data
public class User {

    private String id;
    private String username;
    private String password;
}
