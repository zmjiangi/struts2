package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

/**
 * 部门表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
@Data
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * manager
     */
    private Manager manager;

    /**
     * employees
     */
    private Collection<Employee> employees;

    public Department() {

    }

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
