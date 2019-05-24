package com.gzyijian.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zmjiangi
 * @date 2019-5-24
 */
@Data
public class Manager implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;


    /**
     * birth
     */
    private String birth;

}
