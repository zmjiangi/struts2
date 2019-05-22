package com.gzyijian.dao;

import com.gzyijian.model.User;

import java.util.*;

/**
 * @author zmjiangi
 * @date 2019-5-22
 */
public class UserDao {

    private final static Map<String, User> USER_MAP = new HashMap<>(8);

    static {
        USER_MAP.put("09314163-fc27-4db2-8f5e-557a7402a491", new User("09314163-fc27-4db2-8f5e-557a7402a491", "AA", "aa"));
        USER_MAP.put("09314163-fc27-4db2-8f5e-557a7402a492", new User("09314163-fc27-4db2-8f5e-557a7402a492", "BB", "bb"));
        USER_MAP.put("09314163-fc27-4db2-8f5e-557a7402a493", new User("09314163-fc27-4db2-8f5e-557a7402a493", "CC", "cc"));
        USER_MAP.put("09314163-fc27-4db2-8f5e-557a7402a494", new User("09314163-fc27-4db2-8f5e-557a7402a494", "DD", "dd"));
        USER_MAP.put("09314163-fc27-4db2-8f5e-557a7402a495", new User("09314163-fc27-4db2-8f5e-557a7402a495", "EE", "ee"));
    }

    public void save(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        USER_MAP.put(id, user);
    }

    public void delete(String id) {
        USER_MAP.remove(id);
    }

    public void update(User user) {
        USER_MAP.put(user.getId(), user);
    }

    public User fetch(String id) {
        return USER_MAP.get(id);
    }

    public List<User> list() {
        return new ArrayList<>(USER_MAP.values());
    }

}
