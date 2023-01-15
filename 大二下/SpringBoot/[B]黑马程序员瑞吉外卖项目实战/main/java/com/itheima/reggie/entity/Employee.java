package com.itheima.reggie.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 员工表
 */
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private Integer status;

    @TableField(fill = FieldFill.INSERT) // 新增时自动填充
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE) // 新增或更新时自动填充
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT) // 新增时自动填充
    private Long createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE) // 新增或更新时自动填充
    private Long updateUser;

}
