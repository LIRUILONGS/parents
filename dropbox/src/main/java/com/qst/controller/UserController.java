package com.qst.controller;

import com.qst.pojo.User;
import com.qst.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private User user;
    @Autowired
    private UserService userServiceimlp;

    //登录页面初始化
    @RequestMapping("ipt")
    public String inputUser(Model model,HttpSession session){
        model.addAttribute("user",user);
        return "input";
    }

    //登录后
    @RequestMapping("opt")
    public String output(@ModelAttribute User user,HttpSession session){


        return null;
    }
    //注册页面初始化
    @RequestMapping("reg")
    public String register(Model model){

      model.addAttribute("user",user);

        return "register";
    }

    //注册后
    @RequestMapping("add")
    public  String addUser(@ModelAttribute User user, Model model, HttpSession session) throws Exception {


        if(userServiceimlp.addUser(user)){

            return "redirect:/user/ipt";
        }else {
            session.setAttribute("message","嗯，注册失败啦");
            return "redirect:/user/register";
        }


    }

}
