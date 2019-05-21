package com.gzyijian.model;

/**
 * 部门表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
public class Department {

    private Integer deptId;

    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department(Integer deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Department() {
        // TODO Auto-generated constructor stub
    }

}
