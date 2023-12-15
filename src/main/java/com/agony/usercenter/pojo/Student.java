package com.agony.usercenter.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName student
 */
@TableName(value = "student")
@Data
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String NAME;

    private Integer age;

    private String email;

    private static final long serialVersionUID = 1L;
}