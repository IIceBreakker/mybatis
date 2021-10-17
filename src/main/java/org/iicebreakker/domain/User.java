package org.iicebreakker.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类
 * @author IIceBreakker
 */
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private Boolean gender;
    private Integer age;
    private String role;
}
