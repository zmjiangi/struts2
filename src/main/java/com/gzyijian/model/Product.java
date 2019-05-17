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

    private String name;
    private String desc;
    private Double price;
}
