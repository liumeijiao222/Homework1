package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {
    //实现自动装配
    @Autowired
    private UserMapper userMapper;

    //验证账号密码
    @PostMapping("/login")
    //获取三个参数，账号，密码，按钮是否被点击
    public String login(@Param("username") String username,
                        @Param("password") String password,
                        @Param("btn_login") String btn_login,
                        Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //使用findByUsername_login（）方法，对数据库进行检查，判断账号密码是否正确
        User check_login = userMapper.findByUsername_login(username, password);
        //正确，返回index页面，错误，返回error页面
        if (check_login != null) {
            int ok = 1;
            model.addAttribute("ok", ok);
            model.addAttribute("success_login_username", username);
            return "allHomework";
        } else {
            model.addAttribute("error_btn_login", btn_login);
            model.addAttribute("error_login_username", username);
            model.addAttribute("error_login_password", password);
            return "error";
        }
    }

    //返回登录页面
    @GetMapping("/login.html")
    public String return_login(){
        return "login";
    }
    //返回注册页面
    @GetMapping("/regiest.html")
    public String return_regiest(){
        return "regiest";
    }

}

