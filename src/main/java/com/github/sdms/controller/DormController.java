package com.github.sdms.controller;

import com.github.sdms.entity.Dorm;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.DormService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 宿舍信息(Dorm)表控制层
 *
 * @author makejava
 * @since 2020-10-26 16:46:42
 */
@Controller
@RequestMapping("dorm")
public class DormController {
    /**
     * 服务对象
     */
    @Autowired
    private DormService dormService;

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, String dormCode, String aptName, Model model) {
        Page<Dorm> pageBean = dormService.queryAllByLimit(currentPage, dormCode, aptName);
        model.addAttribute("pageBean", pageBean);

        model.addAttribute("dormCode", dormCode);
        model.addAttribute("aptName", aptName);

        return "dormlist";
    }
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