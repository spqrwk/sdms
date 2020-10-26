package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.User;
import com.github.sdms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public String selectOne(Long id) {
        return JSON.toJSONString(this.userService.queryById(id)) ;
    }

}