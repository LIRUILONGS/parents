package com.qst.service.impl;

import com.qst.pojo.User;
import com.qst.service.intf.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class UserServiceimlpTest {

    @Autowired
    private User user;
    @Autowired
    private UserService userServiceimlp;

    @Test
    public void addUserServiceTest() throws Exception {
        user.setUsername("李瑞long");
        user.setPassword("123456");
        System.out.println("添加成功："+userServiceimlp.addUser(user));

    }
    @Test
    public void logUserTest(){
        user.setUsername("李瑞long");
        user.setPassword("123456");
        System.out.println(user+"登录成功！");
    }

}