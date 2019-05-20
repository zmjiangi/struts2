package com.gzyijian.action;

import lombok.Setter;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;
import java.util.Objects;

/**
 * 登录练习
 *
 * @author zmjiangi
 * @date 2019-5-17
 */
public class LoginAction implements SessionAware, ApplicationAware {

    @Setter
    private String username;
    @Setter
    private String password;

    private Map<String, Object> session;
    private Map<String, Object> application;

    public String login() {
        session.put("username", username);

        Object loginCountObj = application.get("loginCount");
        Integer loginCount = Objects.nonNull(loginCountObj) ? Integer.parseInt(loginCountObj.toString()) + 1 : 1;
        application.put("loginCount", loginCount);
        return "login-success";
    }

    public String logout() {
        Object loginCountObj = application.get("loginCount");
        Integer loginCount = Objects.nonNull(loginCountObj) ?
                (Integer.parseInt(loginCountObj.toString()) > 0 ? Integer.parseInt(loginCountObj.toString()) - 1 : 0) : 0;
        application.put("loginCount", loginCount);


        ((SessionMap) session).invalidate();
        return "logout-success";
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setApplication(Map<String, Object> applicationMap) {
        this.application = applicationMap;
    }
}
