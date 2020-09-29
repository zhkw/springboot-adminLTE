package cn.kt.springboot_cruddemo.service.impl;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.Admin;
import cn.kt.springboot_cruddemo.mapper.AdminMapper;
import cn.kt.springboot_cruddemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findByName(String username) {
        // todo
        return adminMapper.findByName(username);
    }
}
