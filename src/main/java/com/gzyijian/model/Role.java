package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public Role() {
    }

    public Role(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
