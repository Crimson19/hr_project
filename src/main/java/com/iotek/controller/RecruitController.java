package com.iotek.controller;


import com.iotek.po.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @RequestMapping(value = "/addRecruit.view")
    public   String   addRecruitPage(){
        return "recruit/addRecruit";
    }

    @RequestMapping(value = "/addRecruit.do")
    public   String   recruitAdditon(@ModelAttribute Recruit recruit, HttpSession session, Model model){

//        System.out.println("增加之前："+recruit);
        boolean addFlag = recruitService.addRecruit(recruit);
//        System.out.println("增加之后："+recruit);
        if (addFlag){
            model.addAttribute("info","添加成功");
            session.setAttribute("recruit",recruit);
            return "admin/success";

        }
        model.addAttribute("info","添加失败");
        return  "company/index";

    }
}