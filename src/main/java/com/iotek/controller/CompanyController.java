package com.iotek.controller;


import com.iotek.po.*;
import com.iotek.service.DeptService;
import com.iotek.service.JobService;
import com.iotek.service.JobTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping(value = "/company")
public class CompanyController {

//    @Autowired
//    private CompanyService companyService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private JobService jobService;

    @Autowired
    private JobTypeService jobTypeService;


    @RequestMapping(value = "/index.view")
    public   String   indexPage(){
        return "company/index";
    }

//    @RequestMapping(value = "/addCo.view")
//    public   String   addCoPage(){
//        return "company/addCo";
//    }

    @RequestMapping(value = "/addDept.view")
    public   String   addDeptPage(){
        return "company/dept/addDept";
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
    @RequestMapping(value = "manageDept.view")
    public String adminManageDept(HttpSession session,Model model){
        Admin admin = (Admin) session.getAttribute("admin");
        Integer companyId = admin.getCompanyId();
        Dept dept = new Dept();
        dept.setCompanyId(companyId);
        List<Dept> depts = deptService.queryDept(dept);
        model.addAttribute("deptList", depts);
        return "company/dept/manageDept";
    }

    @RequestMapping(value = "/addDept.do")
    public   String   deptAdditon(@ModelAttribute Dept dept, HttpSession session, Model model){
        Admin admin = (Admin) session.getAttribute("admin");
//        System.out.println("增加之前："+dept);
        boolean addFlag = deptService.addDept(dept);
//        System.out.println("增加之后："+dept);
        if (addFlag) {
            model.addAttribute("dept",dept);
        }else{
            model.addAttribute("info","添加失败");
        }
        return "company/dept/addDept";

    }

    @RequestMapping(value = "/addJob.view")
    public   String   addJobPage(){
        return "company/job/addJob";
    }


    @RequestMapping(value = "/addJob.do")
    public   String   jobAdditon(@ModelAttribute Job job, HttpSession session, Model model){

//        System.out.println("增加之前："+job);
        boolean addFlag = jobService.addJob(job);
//        System.out.println("增加之后："+job);
        if (addFlag){
            model.addAttribute("info","添加成功");
            session.setAttribute("job",job);
            return "admin/success";

        }
        model.addAttribute("info","添加失败");
        return  "company/index";

    }

    @RequestMapping(value = "/addJobType.view")
    public   String   addJobTypePage(){
        return "company/job/addJobType";
    }

    @RequestMapping(value = "/addJobType.do")
    public   String   jobTypeAdditon(@ModelAttribute JobType jobType, HttpSession session, Model model){

//        System.out.println("增加之前："+jobType);
        boolean addFlag = jobTypeService.addJobType(jobType);
//        System.out.println("增加之后："+jobType);
        if (addFlag){
            model.addAttribute("info","添加成功");
            session.setAttribute("jobType",jobType);
            return "admin/success";

        }
        model.addAttribute("info","添加失败");
        return  "company/index";

    }
}