package com.iotek.controller;


import com.iotek.po.*;
import com.iotek.service.DeptAndJobService;
import com.iotek.service.DeptService;
import com.iotek.service.JobService;
import com.iotek.service.JobTypeService;
import com.iotek.service.impl.DeptAndJobServiceImpl;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.StringWriter;
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

    @Autowired
    private DeptAndJobService deptAndJobService;


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

    @RequestMapping(value = "showDeptAjax.view",produces = "application/json;charset=UTF-8")
    public @ResponseBody
    String queryDept(HttpSession session) {
        Admin admin = (Admin) session.getAttribute("admin");
        Integer companyId = admin.getCompanyId();
        Dept dept = new Dept();
        dept.setCompanyId(companyId);
        List<Dept> depts = deptService.queryDept(dept);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter w = new StringWriter();
        //Convert between List and JSON
        try {
            mapper.writeValue(w, depts);//开始序列化
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println(w.toString()); //输出json格式的字符串
        return w.toString(); //将json格式的字符串返回给前台
    }

    @RequestMapping(value = "/addDept.do")
    public   String   deptAdditon(@ModelAttribute Dept dept, HttpSession session, Model model){
        Admin admin = (Admin) session.getAttribute("admin");
        Integer companyId = admin.getCompanyId();
        dept.setCompanyId(companyId);
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


    @RequestMapping(value = "addJob.do",produces = "application/json;charset=UTF-8")
    public String queryApartment(HttpSession session, Model model, @RequestParam(value="deptId") String deptIdStr, @ModelAttribute Job Job) {
        /*加公司id*/
        Admin admin = (Admin) session.getAttribute("admin");
        Integer companyId = admin.getCompanyId();
        DeptAndJob deptAndJob = new DeptAndJob();
        deptAndJob.setCompanyId(companyId);
        /*加部门id*/
        int deptId = Integer.parseInt(deptIdStr);
        deptAndJob.setDeptId(deptId);
        jobService.addJob(Job);
        deptAndJobService.addDeptAndJob(deptAndJob);
        return "company/job/addJob";
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