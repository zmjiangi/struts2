package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zmjiangi
 * @date 2019-5-17
 */
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String desc;
    private Double price;

    public Product() {
    }

    public Product(String name, String desc, Double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Product(String id, String name, String desc, Double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
}
