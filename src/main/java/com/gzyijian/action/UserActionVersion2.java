package com.gzyijian.action;

import com.gzyijian.dao.UserDao;
import com.gzyijian.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * 基于 UserActionVersion1 使用 paramsPrepareParamsStack 简化 edit
 *
 * @author zmjiangi
 * @date 2019-5-22
 */
public class UserActionVersion2 extends ActionSupport implements ModelDriven<User>, RequestAware {

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

    /**
     * 跳转到编辑用户页面
     */
    public String edit() {
        /// User userDb = userDao.fetch(id);
        //  user.setId(userDb.getId());
        // user.setFirstName(userDb.getFirstName());
        //  user.setLastName(userDb.getLastName());

        /// 手动的把数据库中获取的User 对象放到值栈的栈顶.
        // 但此时的值栈栈顶及第二个对象均为User 对象, 不够完美。
        // ActionContext.getContext().getValueStack().push(userDao.fetch(user.getId()));
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
    public User getModel() {
        /// 判断是 Create 还是 Edit.
        // 若为Create, 则 user = new User();
        // 若为Edit, 则 user = userDao.fetch(id);
        // 判定的标准为是否有 id 这个请求参数. 如有该参数, 视为Edit; 若没有该参数, 则视为Create.
        // 若通过 id 来判断, 则需要在 modelDriven 拦截器之前执行一个 params 拦截器.
        // 而这可以通过使用 paramsPrepareParams 拦截器实现.
        // 需要在struts.xml 文件中配置使用 paramsPrepareParams 作为默认的拦截器.

        user = StringUtils.isBlank(id) ? new User() : userDao.fetch(id);
        return user;
    }
}
