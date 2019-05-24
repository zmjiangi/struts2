package com.gzyijian.action;

import com.gzyijian.dao.UserDao;
import com.gzyijian.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * 使用 ModelDriven 拦截器将 user 实例对象压入拦截器栈
 *
 * @author zmjiangi
 * @date 2019-5-22
 */
public class UserActionVersion1 extends ActionSupport implements ModelDriven, RequestAware {

    @Getter
    @Setter
    private User user;

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
        userDao.delete(user.getId());
        return SUCCESS;
    }

    /**
     * 跳转到编辑用户页面
     */
    public String edit() {
        User userDb = userDao.fetch(user.getId());
        user.setId(userDb.getId());
        user.setFirstName(userDb.getFirstName());
        user.setLastName(userDb.getLastName());

        return "edit";
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
    public Object getModel() {
        user = new User();
        return user;
    }
}
