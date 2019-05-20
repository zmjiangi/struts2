package com.gzyijian.action;

import com.opensymphony.xwork2.ActionSupport;
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
            return "chain";
        }

        String redirectActionString = "redirectAction";
        if (redirectActionString.equals(param)) {
            return "redirectAction";
        }
        return super.execute();
    }

    public String chain() {
        return "chain";
    }


    public String redirect() {
        return "redirectAction";
    }
}
