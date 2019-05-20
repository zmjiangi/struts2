package com.gzyijian.action;

import lombok.Data;

/**
 * Struts2 HelloWorld
 *
 * @author zmjiangi
 * @date 2019-5-17
 */
@Data
public class ProductAction {

    private String name;
    private String desc;
    private Double price;

    public String save() {
        System.out.println(this);
        return "details";
    }

}
