package com.gzyijian.dao;

import com.gzyijian.model.Employee;

import java.util.*;

/**
 * 员工表
 *
 * @author zmjiangi
 * @date 2019-5-21
 */
public class EmployeeDao {

    private final static Map<String, Employee> EMPLOYEE_MAP = new HashMap<>(16);

    static {
        EMPLOYEE_MAP.put("09314163-fc27-4db2-8f5e-557a7402a491", new Employee("09314163-fc27-4db2-8f5e-557a7402a491", "AA", "aa"));
        EMPLOYEE_MAP.put("09314163-fc27-4db2-8f5e-557a7402a492", new Employee("09314163-fc27-4db2-8f5e-557a7402a492", "BB", "bb"));
        EMPLOYEE_MAP.put("09314163-fc27-4db2-8f5e-557a7402a493", new Employee("09314163-fc27-4db2-8f5e-557a7402a493", "CC", "cc"));
        EMPLOYEE_MAP.put("09314163-fc27-4db2-8f5e-557a7402a494", new Employee("09314163-fc27-4db2-8f5e-557a7402a494", "DD", "dd"));
        EMPLOYEE_MAP.put("09314163-fc27-4db2-8f5e-557a7402a495", new Employee("09314163-fc27-4db2-8f5e-557a7402a495", "EE", "ee"));
    }

    public void save(Employee employee) {
        String id = UUID.randomUUID().toString();
        employee.setId(id);
        EMPLOYEE_MAP.put(id, employee);
    }

    public void delete(String id) {
        EMPLOYEE_MAP.remove(id);
        System.out.println();
    }

    public void update(Employee employee) {
        EMPLOYEE_MAP.put(employee.getId(), employee);
    }

    public Employee fetch(String id) {
        return EMPLOYEE_MAP.get(id);
    }

    public List<Employee> list() {
        return new ArrayList<>(EMPLOYEE_MAP.values());
    }


}
