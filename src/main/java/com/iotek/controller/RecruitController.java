package com.iotek.controller;


import com.iotek.po.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @RequestMapping(value = "/index.view")
    public   String   indexPage(){
        return "recruit/index";
    }

    @RequestMapping(value = "/addRecruit.view")
    public   String   addRecruitPage(){
        return "recruit/addRecruit";
    }

    @RequestMapping(value = "addRecruit.do")
    public String adminAddRecruit(HttpSession session, Model model, @RequestParam(value = "deptAndJobId",required = false) String djId, @ModelAttribute Recruit recruit){
        int newId = Integer.parseInt(djId);
        recruit.setDeptAndJobId(newId);
        boolean addFlag = recruitService.addRecruit(recruit);
        if(addFlag){
            model.addAttribute("Recruit",recruit);
        }else{
            model.addAttribute("info","添加失败");
        }
        return "recruit/addRecruit";
    }
}