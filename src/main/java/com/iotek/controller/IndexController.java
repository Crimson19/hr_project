package com.iotek.controller;

import com.iotek.po.Visitor;
import com.iotek.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    private VisitorService visitorService;

    @RequestMapping(value ="")
    public   String   indexPage(){
      /*  if (true){
            throw  new  NullPointerException();
        }*/

        return "visitor/index";
    }
    @RequestMapping(value = "/visitorIndex.do")
    public   String   visitorIndex(HttpServletRequest request, Visitor visitor, Model model, HttpSession session){

//        检查cookie
        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            return "redirect:/visitor/login.view";
        }
        String visitorName=null;
        String visitorPassword=null;
        for (Cookie cookie : cookies) {
            if ("visitorName".equals(cookie.getName())){
                visitorName=cookie.getValue();

            }
            if ("visitorPassword".equals(cookie.getName())){
                visitorPassword=cookie.getValue();

            }

        }
        visitor.setVisitorName(visitorName);
        visitor.setVisitorPassword(visitorPassword);
        System.out.println("--------->"+visitor);
        visitor = visitorService.queryVisitorByName(visitor);
        if (visitor == null) {
            model.addAttribute("info","登录失败");
            return "redirect:/visitor/login.view";
        }

        session.setAttribute("visitor",visitor);
        model.addAttribute("info","登录成功");

        return "success";


    }

    @RequestMapping(value = "/adminIndex.do")
    public   String   adminIndex(){

     return  null;
    }
}
