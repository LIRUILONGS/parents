package com.qst.service.impl;

import com.qst.dao.UserMapper;
import com.qst.pojo.User;
import com.qst.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimlp implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private User user;

/*
注册
 */
    @Override
    public boolean addUser(User user) throws Exception {
        if(this.logUser(user)==null){
        userMapper.addUser(user);
        if (user.getId() != 0) {
            return true;
        } else {
            return false;
        }
        }else
            return false;
    }

    /*
    登录
     */
    @Override
    public User logUser(User users) throws Exception {

        List<User> list = userMapper.logUser(users);

        if (list.size() != 0) {
            for (int i = 0; i < 2; i++) {
                user = list.get(i);
                return user;
            }
        } else {
             user = null;
        }
        return user;
    }
}
