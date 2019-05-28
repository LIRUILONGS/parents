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


    @Override
    public boolean addUser(User user) throws Exception {

        userMapper.addUser(user);
        if (user.getId() != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User logUser(User user) throws Exception {

        List<User> list = userMapper.logUser(user);
        for (int i =0;i <2;i++)
            user = list.get(i);

        return user;
    }
}
