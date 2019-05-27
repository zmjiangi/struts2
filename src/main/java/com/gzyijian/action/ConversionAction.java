package com.gzyijian.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zmjiangi
 * @date 2019-5-24
 */
public class ConversionAction extends ActionSupport {

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private Date birth;

    @Override
    public String input() throws Exception {
        return INPUT;
    }

    public String save(){
        System.out.println(this);
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "ConversionAction{" +
                "age=" + age +
                ", birth=" + birth +
                '}';
    }
}
