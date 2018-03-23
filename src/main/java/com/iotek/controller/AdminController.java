package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "admin/login";
    }


    @RequestMapping(value = "/login.do")
    public   String  login(@ModelAttribute Admin admin,
                           HttpSession  session, Model model,
                           @RequestParam(value = "isremember" ,required = false) String isremember,
                           HttpServletResponse response
    ){
        System.out.println("登陆之前"+admin);
        admin = adminService.queryAdminByName(admin);
        if (admin == null) {
            model.addAttribute("info","登录失败");
            return "admin/login";
        }
//        保存cookie
        System.out.println(isremember);
        if ("on".equals(isremember)){
            Cookie cookieName=new Cookie("adminName",admin.getAdminName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword=new Cookie("adminPassword",admin.getAdminPassword());
            cookiePassword.setMaxAge(60*60*24*1);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }

        session.setAttribute("admin",admin);
        model.addAttribute("info","登录成功");
        return "admin/success";
    }

    @RequestMapping(value = "adminSuccess.do")
    public String adminSuccess(){
        return "admin/success";
    }
}