package com.github.sdms.controller;

import cn.hutool.crypto.Mode;
import com.github.sdms.entity.Clazz;
import com.github.sdms.service.ClazzService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, String clazzCode, Model model) {
        Page<Clazz> pageBean = clazzService.queryAllByLimit(currentPage, clazzCode);
        System.out.println(pageBean.getRows());
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("clazzCode", clazzCode);
        return "clazzlist";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "clazzadd";
    }

}