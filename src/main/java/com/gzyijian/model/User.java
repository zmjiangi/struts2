package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zmjiangi
 * @date 2019-5-22
 */
@Data
public class User implements Serializable {
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

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
