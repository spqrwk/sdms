package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.Tch;
import com.github.sdms.entity.User;
import com.github.sdms.service.TchService;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


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

    @RequestMapping("view")
    public String view(Long id, Model model) throws Exception {
        Tch tch = tchService.queryById(id);

        model.addAttribute("tch", tch);

        return "tchview";
    }

    @RequestMapping("add")
    public String toAdd() {
        return "tchadd";
    }

    @RequestMapping("/addnew")
    public String add(Tch tch, Model model) {
        try {
            tchService.insert(tch);
            model.addAttribute("addResult", "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("addResult", "添加用户失败！" + e.getMessage());
        }
        return "tchadd";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(Long id) throws Exception {
        tchService.deleteById(id);
        HashMap<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        return JSON.toJSONString(map);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Long id, Model model) throws Exception {
        Tch tch = tchService.queryById(id);
        model.addAttribute("tch", tch);

        return "tchupdate";
    }

    @RequestMapping("update")
    public String update(Tch tch, Long id, HttpServletRequest request, Model model) {
        try {
            tchService.update(tch);

            return "redirect:/tch/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "tchupdate";
        }
    }

    @ResponseBody
    @RequestMapping("/queryalltch")
    public String queryAllTch() {
        HashMap<String, Object> map = null;
        map = new HashMap<>();
        try {
            List<Tch> tchList = tchService.queryAllTch();
            map.put("code", 0);
            map.put("data", tchList);
        } catch (Exception e) {
            map.put("code", 1);
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
}