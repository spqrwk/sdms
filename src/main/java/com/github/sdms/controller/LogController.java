package com.github.sdms.controller;

import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import com.github.sdms.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LogController {
    @Autowired
     private UserService userService;

    @RequestMapping("/dologout")
    public String doLogout(HttpSession session) {
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

    @RequestMapping("main")
    public String toindex(){
        return "index";
    }


    @RequestMapping("dologin")
    public String login(String code, String pwd, HttpServletRequest request,HttpSession session){
        User user = userService.queryByCode(code);
        if (EmptyUtils.isNotEmpty(user)){
            if (pwd.equals(user.getPassword())){
                session.setAttribute("loginUser",user);
                return "redirect:/main";
            }
        }
        request.setAttribute("loginError","账号或密码错误");
        return "login";
    }
}
