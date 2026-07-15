package org.bluebridge.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 员工实体类
 *
 * @author lingwh
 * @date 2025/2/27 14:07
 */
@Data
@TableName("`t_employee`")
public class Employee {

    private Long id;

    //private String lastName;
    private String email;

    private String gender;
}
