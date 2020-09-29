package cn.kt.springboot_cruddemo;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.Admin;
import cn.kt.springboot_cruddemo.domain.User;
import cn.kt.springboot_cruddemo.mapper.UserMapper;
import cn.kt.springboot_cruddemo.service.AdminService;
import cn.kt.springboot_cruddemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootCruddemoApplication.class)
public class MybatisTest {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Test
    public void test() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test1() {
        Admin admin = adminService.findByName("admin");
        System.out.println(admin);
    }
}
