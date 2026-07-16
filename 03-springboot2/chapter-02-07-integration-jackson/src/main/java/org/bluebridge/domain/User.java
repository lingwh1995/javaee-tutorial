package org.bluebridge.domain;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author lingwh
 * @date 2019/12/9 11:37
 */
@Data
public class User {

    private Integer id;

    private String username;

    private String address;
}
