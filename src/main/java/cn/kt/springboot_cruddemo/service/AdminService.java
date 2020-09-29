package cn.kt.springboot_cruddemo.service;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.Admin;

public interface AdminService {
    Admin findByName(String username);
}
