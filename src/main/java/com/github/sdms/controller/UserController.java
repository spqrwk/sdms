package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-23 17:09:01
 */
@RestController
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
    public String selectOne(Long id) throws Exception{
        return JSON.toJSONString(userService.queryById(id));
    }

}