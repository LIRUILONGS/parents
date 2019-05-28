package com.qst.service.intf;

import com.qst.pojo.User;

public interface UserService {


    //注册
    public boolean addUser(User user) throws Exception;

    //登录
    public User logUser(User user) throws Exception;

}
