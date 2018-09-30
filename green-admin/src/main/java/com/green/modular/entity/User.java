package com.green.modular.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author limingliang
 * @since 2018-09-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String avatar;

    private String account;

    private String password;

    private String salt;

    private String name;

    private LocalDateTime birthday;

    private Integer sex;

    private String email;

    private String phone;

    private String roleid;

    private Integer deptid;

    private Integer status;

    private LocalDateTime createtime;

    private Integer version;


}
