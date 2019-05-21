package com.gzyijian.dao;

import com.gzyijian.model.Department;

import java.util.Arrays;
import java.util.List;

/**
 * @author zmjiangi
 * @date 2019-5-21
 */
public class DepartmentDao {

    public List<Department> list() {
        return Arrays.asList(
                new Department(1001, "AAA"),
                new Department(1002, "BBB"),
                new Department(1003, "CCC"),
                new Department(1004, "DDD"),
                new Department(1005, "EEE")
        );
    }

}
