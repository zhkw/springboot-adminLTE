package cn.kt.springboot_cruddemo.mapper;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin findByName(String username);
}
