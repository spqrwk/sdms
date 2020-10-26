package com.github.sdms.controller;

import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import com.github.sdms.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("log")
public class LogController {
    @Autowired
     private UserService userService;

    @RequestMapping("login")
    public String login(String code,String pwd){
        User user = userService.queryByCode(code);
        if (EmptyUtils.isNotEmpty(user)){
            if (pwd.equals(user.getPassword())){
                return "登陆成功";
            }
        }
        return "登录失败";
    }
}
