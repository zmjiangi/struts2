package com.gzyijian.action;

import com.gzyijian.model.Department;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import lombok.Getter;
import lombok.Setter;

/**
 * 部门控制层
 *
 * @author zmjiangi
 * @date 2019-5-24
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>, Preparable {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Department department;

    @Override
    public String input() {
        return INPUT;
    }


    public void prepareTestComplexAttribute() {
        department = new Department();
    }

    /**
     * 测试类型转换与复杂属性配合使用
     *
     * @return
     */
    public String testComplexAttribute() {
        System.out.println(department);
        return SUCCESS;
    }

    @Override
    public Department getModel() {
        return department;
    }

    @Override
    public void prepare() throws Exception {
        System.out.println("DepartmentAction.prepare");
    }

}
