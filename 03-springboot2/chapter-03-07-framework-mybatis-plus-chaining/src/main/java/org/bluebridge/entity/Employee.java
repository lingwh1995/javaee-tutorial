package org.bluebridge.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 员工实体类
 *
 * @author lingwh
 * @date 2025/2/27 14:45
 */
@AllArgsConstructor
@Builder
@Data
@TableName("t_employee")
public class Employee {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("last_name")
    private String lastName;

    @TableField("email")
    private String email;

    @TableField("gender")
    private String gender;

    @TableField("dept_no")
    private String deptNo;
}
