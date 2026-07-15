package org.bluebridge.entity;

import lombok.Data;
import org.bluebridge.anno.TableName;

/**
 * 员工实体类
 *
 * @author lingwh
 * @date 2026/7/14 09:18
 */
@Data
@TableName("t_employee")
public class Employee {

    private Long id;

    private String lastName;

    private String email;

    private String gender;

    private String deptNo;
}
