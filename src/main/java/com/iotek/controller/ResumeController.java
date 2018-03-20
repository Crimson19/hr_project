package com.iotek.controller;


import com.iotek.po.Resume;
import com.iotek.service.ResumeServive;
import com.iotek.service.impl.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/resume")
public class ResumeController {

    @Autowired
    private ResumeServive resumeService;

    @RequestMapping(value = "/index.view")
    public   String   indexPage(){
        return "resume/index";
    }

    @RequestMapping(value = "/addResume.view")
    public   String   addRecruitPage(){
        return "resume/addResume";
    }

    @RequestMapping(value = "/addResume.do")
    public   String   recruitAdditon(@ModelAttribute Resume resume, HttpSession session, Model model){

//        System.out.println("增加之前："+recruit);
        boolean addFlag = resumeService.addResume(resume);
//        System.out.println("增加之后："+recruit);
        if (addFlag){
            model.addAttribute("info","添加成功");
            session.setAttribute("resume",resume);
            return "resume/success";

        }
        model.addAttribute("info","添加失败");
        return  "resume/index";

    }
}