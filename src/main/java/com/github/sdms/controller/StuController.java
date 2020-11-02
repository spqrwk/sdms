package com.github.sdms.controller;

import com.alibaba.fastjson.JSON;
import com.github.sdms.entity.DeadlineDate;
import com.github.sdms.entity.Stu;
import com.github.sdms.service.DormService;
import com.github.sdms.service.StuService;
import com.github.sdms.util.Constants;
import com.github.sdms.util.FileInput;
import com.github.sdms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


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

    @Autowired
    private DormService dormService;

    @RequestMapping("list")
    public String list(@RequestParam(defaultValue = "1", value = "p") Integer currentPage, DeadlineDate deadlineDate, String aptName, String tchName, String clazzCode, Model model) {
        System.out.println(deadlineDate);
        Page<Stu> pageBean = stuService.queryAllByLimit(currentPage, deadlineDate.getStartDate(), deadlineDate.getEndDate(), aptName, tchName, clazzCode);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("startDate", deadlineDate.getStartDate());
        model.addAttribute("endDate", deadlineDate.getEndDate());
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
    public String update(Stu stu, HttpServletRequest request, Model model) {
        try {
            stuService.update(stu);

            return "redirect:/stu/list";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("updateResult", "修改失败！" + e.getMessage());
            return "stuupdate";
        }
    }

    @RequestMapping("tofileupload")
    public String toFileUpload() {
        return "fileuploadlist";
    }

    @RequestMapping("fileupload")
    public String fileUpload(MultipartFile excelUpload, HttpSession session, Model model) {
        try {
            String excelUploadPath = null;
            if (!excelUpload.isEmpty()) {
                String originalFilename = excelUpload.getOriginalFilename();
                File file = new File(Constants.WIN_ROOT_DIR, originalFilename);
                excelUpload.transferTo(file);
                excelUploadPath = file.getPath();
                FileInput fileInput = new FileInput();
                for (Stu stuObj : fileInput.getStuList(new FileInputStream(excelUploadPath))) {
                    System.out.println(stuObj);
                    // stuObj.setDormId((long) 1);
                    stuObj.setDormId(dormService.queryDormId(stuObj.getAptName(), stuObj.getDormCode()));
                    stuService.insertStu(stuObj);
                }
                // stuService.insertForEach(fileInput.getStuList(new FileInputStream(excelUploadPath)));
            }
            model.addAttribute("uploadResult", "上传成功");
        } catch (Exception e) {
            model.addAttribute("uploadResult", "上传失败");

        }
        return "fileuploadlist";
    }
}