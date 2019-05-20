package com.gzyijian.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

/**
 * Struts2 HelloWorld
 *
 * @author zmjiangi
 * @date 2019-5-17
 */
@Data
public class ProductAction extends ActionSupport {

    private String name;
    private String desc;
    private Double price;

    public String save() {
        System.out.println(this);
        System.out.println("ProductAction.save");
        return SUCCESS;
    }

    public String delete() {
        System.out.println(this);
        System.out.println("ProductAction.delete");
        return SUCCESS;
    }

    public String update() {
        System.out.println(this);
        System.out.println("ProductAction.update");
        return SUCCESS;
    }

    public String query() {
        System.out.println(this);
        System.out.println("ProductAction.query");
        return SUCCESS;
    }

    public String list() {
        System.out.println(this);
        System.out.println("ProductAction.list");
        return SUCCESS;
    }

}
