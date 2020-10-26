package com.github.sdms.controller;

import com.github.sdms.entity.Tch;
import com.github.sdms.service.TchService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 班主任信息(Tch)表控制层
 *
 * @author makejava
 * @since 2020-10-26 09:40:43
 */
@Controller
@RequestMapping("tch")
public class TchController {
    /**
     * 服务对象
     */
    @Autowired
    private TchService tchService;

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, String tchName, Model model) {
        Page<Tch> pageBean = tchService.queryAllByLimit(currentPage, tchName);
        model.addAttribute("pageBean", pageBean);

        model.addAttribute("tchName", tchName);

        return "tchlist";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Tch selectOne(Long id) {
        return this.tchService.queryById(id);
    }

}