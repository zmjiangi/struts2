package com.gzyijian.action;

import com.gzyijian.dao.UserDao;
import com.gzyijian.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * 基于 UserActionVersion2 使用 Preparable 优化代码
 *
 * @author zmjiangi
 * @date 2019-5-23
 */
public class UserActionVersion3 extends ActionSupport implements ModelDriven<User>, Preparable, RequestAware {

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private String id;

    private Map<String, Object> request;

    private UserDao userDao = new UserDao();

    /**
     * 用户列表
     *
     * @return
     */
    public String list() {
        request.put("list", userDao.list());
        return "list";
    }

    public void prepareSave() {
        user = new User();
    }

    /**
     * 保存新增用户信息
     *
     * @return
     */
    public String save() {
        userDao.save(user);
        return SUCCESS;
    }

    /**
     * 删除用户
     *
     * @return
     */
    public String delete() {
        userDao.delete(id);
        return SUCCESS;
    }


    public void prepareEdit() {
        user = userDao.fetch(id);
    }

    /**
     * 跳转到编辑用户页面
     */
    public String edit() {
        return "edit";
    }

    public void prepareUpdate() {
        /// 这里看情况，如果表单只有 user 实例的部分属性，那么 user = userDao.fetch(id);
        user = new User();
    }

    /**
     * 保存修改用户信息
     *
     * @return
     */
    public String update() {
        userDao.update(user);
        return SUCCESS;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public void prepare() throws Exception {
        System.out.println("UserActionVersion3.prepare");
    }
}
