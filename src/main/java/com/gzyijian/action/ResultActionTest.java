package com.gzyijian.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * Result测试
 *
 * @author zmjiangi
 * @date 2019-5-20
 */
public class ResultActionTest extends ActionSupport {

    @Setter
    private String param;

    @Getter
    @Setter
    private String deliveryParam;

    @Override
    public String execute() throws Exception {

        String dispatcherString = "dispatcher";
        if (dispatcherString.equals(param)) {
            return "dispatcher";
        }

        String redirectString = "redirect";
        if (redirectString.equals(param)) {
            return "redirect";
        }

        String chainString = "chain";
        if (chainString.equals(param)) {
            deliveryParam = "chainParamValue";
            return "chain";
        }

        String redirectActionString = "redirectAction";
        if (redirectActionString.equals(param)) {
            deliveryParam = "redirectActionParamValue";
            return "redirectAction";
        }
        return super.execute();
    }

    public String chain() {
        System.out.println("deliveryParam = " + deliveryParam);
        return "chain";
    }


    public String redirectAction() {
        System.out.println("deliveryParam = " + deliveryParam);
        return "redirectAction";
    }
}
