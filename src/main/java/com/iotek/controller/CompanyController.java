package com.iotek.controller;


import com.iotek.po.Dept;
import com.iotek.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/company")
public class CompanyController {

//    @Autowired
//    private CompanyService companyService;

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/manager.view")
    public   String   indexPage(){
        return "company/index";
    }

//    @RequestMapping(value = "/addCo.view")
//    public   String   addCoPage(){
//        return "company/addCo";
//    }

    @RequestMapping(value = "/addDept.view")
    public   String   addDeptPage(){
        return "company/addDept";
    }

//    @RequestMapping(value = "/addCo.do")
//    public   String   companyAdditon(@ModelAttribute Company company, HttpSession session, Model model){
//
////        System.out.println("增加之前："+company);
//        boolean addFlag = companyService.addCompany(company);
////        System.out.println("增加之后："+company);
//        if (addFlag){
//            model.addAttribute("info","添加成功");
//            session.setAttribute("company",company);
//            return "admin/success";
//
//        }
//        model.addAttribute("info","添加失败");
//        return  "company/index";
//
//    }
    @RequestMapping(value = "/addDept.do")
    public   String   deptAdditon(@ModelAttribute Dept dept, HttpSession session, Model model){

//        System.out.println("增加之前："+dept);
        boolean addFlag = deptService.addDept(dept);
//        System.out.println("增加之后："+dept);
        if (addFlag){
            model.addAttribute("info","添加成功");
            session.setAttribute("dept",dept);
            return "admin/success";

        }
        model.addAttribute("info","添加失败");
        return  "company/index";

    }
}