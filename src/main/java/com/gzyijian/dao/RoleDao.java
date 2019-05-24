package com.gzyijian.dao;

import com.gzyijian.model.Role;

import java.util.Arrays;
import java.util.List;

/**
 * @author zmjiangi
 * @date 2019-5-21
 */
public class RoleDao {

    public List<Role> list() {
        return Arrays.asList(
                new Role("2001", "XXX"),
                new Role("2002", "YYY"),
                new Role("2003", "ZZZ")
        );
    }

}
