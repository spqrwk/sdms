package com.github.sdms.controller;

import com.github.sdms.entity.Clazz;
import com.github.sdms.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 班级信息(Clazz)表控制层
 *
 * @author makejava
 * @since 2020-10-26 10:38:01
 */
@Controller
@RequestMapping("clazz")
public class ClazzController {
    /**
     * 服务对象
     */
    @Autowired
    private ClazzService clazzService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Clazz selectOne(Long id) {
        return this.clazzService.queryById(id);
    }

}