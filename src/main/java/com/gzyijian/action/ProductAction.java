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

    public String input() {
        System.out.println();
        System.out.println("ProductAction.input");
        return "input";
    }

    public String save() {
        System.out.println(this);
        System.out.println("ProductAction.save");
        return "save";
    }

    public String delete() {
        System.out.println(this);
        System.out.println("ProductAction.delete");
        return "delete";
    }

    public String update() {
        System.out.println(this);
        System.out.println("ProductAction.update");
        return "update";
    }

    public String query() {
        System.out.println(this);
        System.out.println("ProductAction.query");
        return "query";
    }

    public String list() {
        System.out.println(this);
        System.out.println("ProductAction.list");
        return "list";
    }

}
