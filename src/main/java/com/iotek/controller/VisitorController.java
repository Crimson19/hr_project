package com.iotek.controller;

import com.iotek.po.Visitor;
import com.iotek.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;


@Controller
@RequestMapping(value = "/visitor")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;


    @RequestMapping(value = "/reg.view")
    public   String   regPage(){
        return "visitor/register";
    }

    @RequestMapping(value = "/reg.do")
    public   String   visitorRegister(@ModelAttribute Visitor visitor, HttpSession session, Model model){

//        System.out.println("增加之前："+visitor);
        boolean addFlag = visitorService.addVisitor(visitor);
//        System.out.println("增加之后："+visitor);
        if (addFlag){
            model.addAttribute("info","注册成功");
            session.setAttribute("visitor",visitor);
            return "visitor/success";

        }
        model.addAttribute("info","注册失败");
        return  "visitor/index";

    }
    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "visitor/login";
    }


    @RequestMapping(value = "/login.do")
    public   String  login(@ModelAttribute  Visitor visitor, HttpSession  session, Model model){
//        System.out.println("登陆之前"+visitor);
        visitor = visitorService.queryVisitorByName(visitor);
        if (visitor == null) {
            model.addAttribute("info","登录失败");
            return "visitor/index";
        }
//        保存cookie
//        System.out.println(isremember);
//        if ("on".equals(isremember)){
//            Cookie cookieName=new Cookie("visitorName",visitor.getVisitorName());
//            cookieName.setMaxAge(60*60*24*7);
//            cookieName.setPath("/");
//            Cookie cookiePassword=new Cookie("visitorPassword",visitor.getVisitorPassword());
//            cookiePassword.setMaxAge(60*60*24*1);
//            cookiePassword.setPath("/");
//            response.addCookie(cookieName);
//            response.addCookie(cookiePassword);
//        }

        session.setAttribute("visitor",visitor);
        model.addAttribute("visitor",visitor);

        return "visitor/success";
    }

    private  String saveImage(MultipartFile file)  {
        /*保存文件路径根目录*/
        String uploadPath = /*context.getRealPath("") + File.separator + */"images" + File.separator;
        /*文件名加目录*/
        String desPath =uploadPath+file.getOriginalFilename();
        /*创建目标文件*/
        File desfile=new File(desPath);
        try {
            FileCopyUtils.copy(file.getBytes(),desfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "images" + File.separator+file.getOriginalFilename();

    }

    @RequestMapping("/visitor.info")
    public   String   visitorInfo(){
        return "visitor/success";
    }

    @RequestMapping("/index.view")
    public   String   visitorIndex(){
        return "visitor/index";
    }

}