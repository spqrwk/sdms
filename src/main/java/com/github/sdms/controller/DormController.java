package com.github.sdms.controller;

import com.github.sdms.entity.Dorm;
import com.github.sdms.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 宿舍信息(Dorm)表控制层
 *
 * @author makejava
 * @since 2020-10-26 10:25:39
 */
@Controller
@RequestMapping("dorm")
public class DormController {
    /**
     * 服务对象
     */
    @Autowired
    private DormService dormService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dorm selectOne(Long id) {
        return this.dormService.queryById(id);
    }

}