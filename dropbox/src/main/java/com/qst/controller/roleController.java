package com.qst.controller;

import com.qst.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("role")
public class roleController {

    @RequestMapping("login")
    public String rolelogin(HttpServletRequest request, HttpServletResponse response, Model model){

       HttpSession session =  request.getSession();
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);

        return "rolemain";
    }
}
