package com.gzyijian.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 访问 web 资源
 *
 * @author zmjiangi
 * @date 2019-5-20
 */
public class WebResourceActionTest extends ActionSupport implements
        RequestAware,
        SessionAware,
        ApplicationAware,
        HttpParametersAware,

        ServletRequestAware,
        ServletContextAware {

    private Map<String, Object> request;
    private Map<String, Object> session;
    private Map<String, Object> application;
    private HttpParameters httpParameters;

    private HttpServletRequest httpServletRequest;
    private ServletContext servletContext;


    // 与 Servlet API 解耦的访问方式 开始

    public String testActionContext() {
        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> request = (Map<String, Object>) actionContext.get("request");
        Map<String, Object> session = actionContext.getSession();
        Map<String, Object> application = actionContext.getApplication();

        request.put("requestKey", "~requestValue");
        session.put("sessionKey", "~sessionValue");
        application.put("applicationKey", "~applicationValue");

        HttpParameters parameters = actionContext.getParameters();
        Parameter parameter = parameters.get("name");
        System.out.println("parameter.getValue() = " + parameter.getValue());

        if (session instanceof SessionMap) {
            SessionMap sessionMap = (SessionMap) session;
            sessionMap.invalidate();
        }

        return SUCCESS;
    }

    public String testAware() {
        request.put("requestKey", "@requestValue");
        session.put("sessionKey", "@sessionValue");
        application.put("applicationKey", "@applicationValue");
        Parameter parameter = httpParameters.get("name");
        System.out.println("parameter.getValue() = " + parameter.getValue());

        return SUCCESS;
    }

    // 与 Servlet API 解耦的访问方式 结束


    // 与 Servlet API 耦合的访问方式 开始

    public String testServletActionContext() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = ServletActionContext.getRequest().getSession();
        ServletContext servletContext = ServletActionContext.getServletContext();

        request.setAttribute("requestKey", "#requestValue");
        session.setAttribute("sessionKey", "#sessionValue");
        servletContext.setAttribute("applicationKey", "#applicationValue");

        return SUCCESS;
    }

    public String testServletAware() {
        httpServletRequest.setAttribute("requestKey", "$requestValue");
        httpServletRequest.getSession().setAttribute("sessionKey", "$sessionValue");
        servletContext.setAttribute("applicationKey", "$applicationValue");

        return SUCCESS;
    }

    // 与 Servlet API 耦合的访问方式 结束


    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public void setParameters(HttpParameters httpParameters) {
        this.httpParameters = httpParameters;
    }

}
