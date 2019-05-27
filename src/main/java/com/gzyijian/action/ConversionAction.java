package com.gzyijian.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zmjiangi
 * @date 2019-5-24
 */
public class ConversionAction extends ActionSupport {

    @Getter
    @Setter
    private Integer age;

    @Override
    public String input() throws Exception {
        return INPUT;
    }

    public String save(){
        return SUCCESS;
    }
}
