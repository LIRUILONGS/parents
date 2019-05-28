package com.qst.dao;

import com.qst.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class UserMapperTest {

    @Autowired
    private User user;
    @Autowired
    private UserMapper userMapper;

    @Test
    public   void  addUserTest() throws Exception {
        user.setUsername("李瑞longaa");
        user.setPassword("123456aa");
        userMapper.addUser(user);
        System.out.println(user.getId());
    }
    @Test
    public  void loginUserTest()throws Exception{
        user.setUsername("李瑞longss");
        user.setPassword("123456ss");
        if (userMapper.logUser(user)!=null){
            System.out.println("查询成功！！");
        }
    }

}