package com.github.sdms.controller;

import com.github.sdms.entity.Stu;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 学生信息(Stu)表控制层
 *
 * @author makejava
 * @since 2020-10-26 10:35:47
 */
@Controller
@RequestMapping("stu")
public class StuController {
    /**
     * 服务对象
     */
    @Autowired
    private StuService stuService;

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, String paymentDeadline, String aptName, String tchName, String clazzCode, Model model) {
        Page<Stu> pageBean = stuService.queryAllByLimit(currentPage, paymentDeadline, aptName, tchName, clazzCode);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("aptName",aptName);
        model.addAttribute("tchName",tchName);
        model.addAttribute("clazzCode",clazzCode);
        return "stulist";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "stuadd";
    }
}