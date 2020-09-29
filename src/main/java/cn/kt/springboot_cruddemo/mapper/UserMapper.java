package cn.kt.springboot_cruddemo.mapper;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper  {
    List<User> findAll();

    boolean saveUser(User user);
    User findById(int id);
    boolean delUser(int id);
    boolean updateUser(User user);
}
