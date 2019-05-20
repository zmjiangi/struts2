package com.gzyijian.model;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zmjiangi
 * @date 2019-5-17
 */
@Data
public class Product extends ActionSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
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

    public Product(Integer id, String name, String desc, Double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("Product.execute");
        return SUCCESS;
    }

    public String save(){
        System.out.println("Product.save");
        return SUCCESS;
    }
}
