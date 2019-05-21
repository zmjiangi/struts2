package com.gzyijian.action;

import com.gzyijian.dao.DepartmentDao;
import com.gzyijian.dao.RoleDao;
import org.apache.struts2.interceptor.RequestAware;

import java.util.List;
import java.util.Map;

/**
 * @author zmjiangi
 * @date 2019-5-20
 */
public class EmployeeAction implements RequestAware {

    private Map<String, Object> requestMap = null;

    private DepartmentDao departmentDao = new DepartmentDao();
    private RoleDao roleDao = new RoleDao();

    private String name;
    private String password;

    private String gender;
    private String dept;

    private List<String> roles;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String save() {
        System.out.println("save: " + this);
        return "save";
    }

    public String delete() {
        System.out.println(this);
        System.out.println("ProductAction.delete");
        return "input";
    }

    public String update() {
        System.out.println(this);
        System.out.println("ProductAction.delete");
        return "input";
    }

    public String input() {
        requestMap.put("depts", departmentDao.list());
        requestMap.put("roles", roleDao.list());
        return "input";
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.requestMap = request;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", password=" + password
                + ", gender=" + gender + ", dept=" + dept + ", roles=" + roles
                + ", desc=" + desc + "]";
    }
}
