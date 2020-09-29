package cn.kt.springboot_cruddemo.service;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    boolean saveUser(User user);
    User findById(int id);
    boolean delUser(int id);
    boolean updateUser(User user);
}
