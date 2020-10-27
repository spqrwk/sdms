package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Tch;
import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 系统登录用户信息(User)表控制层
 *
 * @author makejava
 * @since 2020-10-26 09:41:01
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, String userCode, String username, Model model) {
        Page<User> pageBean = userService.queryAllByLimit(currentPage, userCode, username);
        model.addAttribute("pageBean", pageBean);

        model.addAttribute("userCode", userCode);
        model.addAttribute("username", username);

        return "userlist";
    }

    @RequestMapping("view")
    public String view(Long id, Model model) throws Exception {
        // 根据ID查询用户信息
        User user = userService.queryById(id);

        model.addAttribute("user", user);

        return "userview";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "useradd";
    }


}