package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Stu;
import com.github.sdms.entity.Tch;
import com.github.sdms.entity.User;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;


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
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, Date startDate, Date endDate, String aptName, String tchName, String clazzCode, Model model) {
        Page<Stu> pageBean = stuService.queryAllByLimit(currentPage, startDate, endDate, aptName, tchName, clazzCode);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);
        model.addAttribute("aptName",aptName);
        model.addAttribute("tchName",tchName);
        model.addAttribute("clazzCode",clazzCode);
        return "stulist";
    }

    @RequestMapping("view")
    public String view(Long id, Model model) throws Exception {
        Stu stu = stuService.queryById(id);
        model.addAttribute("stu", stu);

        return "stuview";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "stuadd";
    }

    @RequestMapping("addnew")
    public String add(Stu stu, Model model) {
        try {
            stuService.insert(stu);
            model.addAttribute("addResult", "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("addResult", "添加用户失败！" + e.getMessage());
        }
        return "stuadd";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(Long id) throws Exception {
        stuService.deleteById(id);
        HashMap<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        return JSON.toJSONString(map);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Long id, Model model) throws Exception {
        Stu stu = stuService.queryById(id);
        model.addAttribute("stu", stu);

        return "stuupdate";
    }

    @RequestMapping("update")
    public String update(Long id, HttpServletRequest request, Model model) {
        try {
            Stu stu = stuService.queryById(id);
            if (stu == null) {
                throw new Exception("用户不存在！");
            }
            stuService.insert(stu);

            return "redirect:/stu/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "stuupdate";
        }
    }
}