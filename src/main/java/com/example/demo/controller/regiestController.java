package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class regiestController {
    //实现自动装配
    @Autowired
    private UserMapper userMapper;
    //点击注册按钮后，获取input中的两个name，作为参数回传到regiest_show()，进行检测
    @RequestMapping("/regiest")
    public String regiest_show(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("btn_regiest") String btn_regiest,
            Model model
    ) {
        //把前端的username和password写入user对象，方便后续操作
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if(username == null || username == "" || password == "" || password == null ){
            model.addAttribute("btn_regiest",btn_regiest);
            return "error";
        }else{
            //使用findByUsername（）方法，判断userCheck是否为空（在数据库中是否存在）
            User userCheck = userMapper.findByUsername(username);
            if (userCheck == null) {
                //不存在，执行插入操作，注册成功，返回ok_regiest页面
                userMapper.add(user);
                model.addAttribute("regiest_username", username);
                model.addAttribute("regiest_password", password);
                return "ok_regiest";
            } else {
                int CunZai = 1;
                //账号存在，返回error页面
                model.addAttribute("regiest_username", username);
                model.addAttribute("CunZai",CunZai);
                return "error";
            }
        }
    }
}
