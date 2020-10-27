package com.github.sdms.controller;

import cn.hutool.core.convert.impl.DateConverter;
import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Tch;
import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import com.github.sdms.util.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;


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
        User user = userService.queryById(id);
        model.addAttribute("user", user);

        return "userview";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "useradd";
    }

    @RequestMapping("/addnew")
    public String add(User user, Model model) {
        try {
            userService.insert(user);
            model.addAttribute("addResult", "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("addResult", "添加用户失败！" + e.getMessage());
        }
        return "useradd";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(Long id) throws Exception {
        userService.deleteById(id);
        HashMap<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        return JSON.toJSONString(map);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Long id, Model model) throws Exception {
        User user = userService.queryById(id);
        model.addAttribute("user", user);

        return "userupdate";
    }

    @RequestMapping("update")
    public String update(Long id, HttpServletRequest request, Model model) {
        try {
            User user = userService.queryById(id);
            userService.update(user);

            return "redirect:/user/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "userupdate";
        }
    }
}