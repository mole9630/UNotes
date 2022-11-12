package com.mybatis.mapper;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
    User selectByID(int id);
}
