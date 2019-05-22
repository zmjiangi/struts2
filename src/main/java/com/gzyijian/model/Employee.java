package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 员工表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * firstName
     */
    private String firstName;

    /**
     * lastName
     */
    private String lastName;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
