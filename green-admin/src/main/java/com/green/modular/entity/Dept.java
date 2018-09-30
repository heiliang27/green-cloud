package com.green.modular.entity;

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
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer num;

    private Integer pid;

    private String simplename;

    private String fullname;

    private String tips;

    private Integer version;


}
