package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Dorm;
import com.github.sdms.entity.Tch;
import com.github.sdms.service.DormService;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


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

    @RequestMapping("view")
    public String view(Long id, Model model) throws Exception {
        Dorm dorm = dormService.queryById(id);
        model.addAttribute("dorm", dorm);
        return "dormview";
    }
    
    @RequestMapping("add")
    public String toAdd() {
        return "dormadd";
    }

    @RequestMapping("/addnew")
    public String add(Dorm dorm, Model model) {
        try {
            dormService.insert(dorm);
            model.addAttribute("addResult", "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("addResult", "添加用户失败！" + e.getMessage());
        }
        return "dormadd";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(Long id) throws Exception {
        dormService.deleteById(id);
        HashMap<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        return JSON.toJSONString(map);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Long id, Model model) throws Exception {
        Dorm dorm = dormService.queryById(id);
        model.addAttribute("dorm", dorm);

        return "dormupdate";
    }

    @RequestMapping("update")
    public String update(Dorm dorm,Model model) {
        try {
            dormService.update(dorm);

            return "redirect:/dorm/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "dormupdate";
        }
    }

    @ResponseBody
    @RequestMapping("queryallaptname")
    public String queryAllAptName() {
        List<Dorm> dormList = dormService.queryAllAptName();
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(dormList);
        map.put("code", 0);
        map.put("data", dormList);

        return JSON.toJSONString(map);
    }

    @ResponseBody
    @RequestMapping("queryallbyaptname")
    public String queryAllByAptName(String aptName) {
        List<Dorm> dormList = dormService.queryAllByAptName(aptName);
        System.out.println(dormList);
        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 0);
        map.put("data", dormList);

        return JSON.toJSONString(map);
    }
}