package com.qst.dao;

import com.qst.pojo.User;

import java.util.List;

public interface UserMapper {

    //注册
    void addUser(User user) throws Exception;
    //登录
    List<User> logUser(User user)throws Exception;
}
