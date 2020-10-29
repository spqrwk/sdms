package com.github.sdms.controller;

import cn.hutool.crypto.Mode;
import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Clazz;
import com.github.sdms.entity.Stu;
import com.github.sdms.service.ClazzService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


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

    @RequestMapping("view")
    public String view(Long id, Model model) throws Exception {
        Clazz clazz = clazzService.queryById(id);
        model.addAttribute("clazz", clazz);

        return "clazzview";
    }
    
    @RequestMapping("add")
    public String toAdd() {
        return "clazzadd";
    }

    @RequestMapping("/addnew")
    public String add(Clazz clazz, Model model) {
        try {
            clazzService.insert(clazz);
            model.addAttribute("addResult", "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("addResult", "添加用户失败！" + e.getMessage());
        }
        return "clazzadd";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(Long id, String clazzCode) throws Exception {
        Clazz clazz = clazzService.queryById(id);
        clazzService.deleteById(id, clazz.getCode());
        HashMap<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        return JSON.toJSONString(map);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Long id, Model model) throws Exception {
        Clazz clazz = clazzService.queryById(id);
        model.addAttribute("clazz", clazz);

        return "clazzupdate";
    }

    @RequestMapping("update")
    public String update(Clazz clazz, HttpServletRequest request, Model model) {
        try {
            clazzService.update(clazz);
            return "redirect:/clazz/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "clazzupdate";
        }
    }

    @ResponseBody
    @RequestMapping("queryallclazz")
    public String queryAllClazz() {
        List<Clazz> clazzList = clazzService.queryAllClazz();
        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 0);
        map.put("data", clazzList);
        return JSON.toJSONString(map);
    }
}