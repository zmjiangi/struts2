package com.gzyijian.model;

/**
 * 角色表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
public class Role {

    private Integer roleId;

    private String roleName;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(Integer roleId, String roleName) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Role() {
        // TODO Auto-generated constructor stub
    }

}
