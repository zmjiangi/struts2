package com.gzyijian.action;

import com.gzyijian.dao.EmployeeDao;
import com.gzyijian.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * 不使用通配符映射请求 实现crud
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
public class EmployeeAction extends ActionSupport implements RequestAware {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    private Map<String, Object> request;

    private EmployeeDao employeeDao = new EmployeeDao();

    public String list() {
        request.put("list", employeeDao.list());
        return "list";
    }

    public String save() {
        Employee employee = new Employee(firstName, lastName);
        employeeDao.save(employee);
        return "save-success";
    }

    public String delete() {
        employeeDao.delete(id);
        return "delete-success";
    }

    /**
     * 跳转到编辑页面
     */
    public String edit() {
        Employee employee = employeeDao.fetch(id);
        firstName = employee.getFirstName();
        lastName = employee.getLastName();
        return "edit";
    }

    /**
     * 保存修改
     *
     * @return
     */
    public String update() {
        Employee employee = new Employee(id, firstName, lastName);
        employeeDao.update(employee);
        return "update-success";
    }


    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

}
