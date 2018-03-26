package com.iotek.controller;


import com.iotek.Util.TimeUtil;
import com.iotek.po.Empolyee;
import com.iotek.po.Message;
import com.iotek.po.Visitor;
import com.iotek.service.EmpolyeeService;
import com.iotek.service.MessageService;
import com.iotek.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping(value = "/empolyee")
public class EmpolyeeController {
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private EmpolyeeService empolyeeService;
    @Autowired
    private MessageService messageService;


    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "empolyee/login";
    }

    @RequestMapping(value = "/login.do")
    public   String  loginAsEmp(@ModelAttribute Visitor visitor, HttpSession session, Model model){
//        System.out.println("登陆之前"+visitor);
        visitor = visitorService.queryVisitorByName(visitor);
        Empolyee empolyee = new Empolyee();
        empolyee.setVisitorId(visitor.getId());
        List<Empolyee> empolyeeList = empolyeeService.queryEmp(empolyee);
        if (empolyeeList == null || empolyeeList.get(0) == null) {
            model.addAttribute("info","您还不是员工");
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

        session.setAttribute("empolyee",empolyeeList.get(0));
        model.addAttribute("empolyee",empolyeeList.get(0));
        session.setAttribute("visitor",visitor);
        model.addAttribute("visitor",visitor);
        return "empolyee/success";
    }

    @RequestMapping(value = "changeVisitorToEmpolyeeByInterviewMessage.do")
    public String adminNewEmpByInterviewMessage(
            @RequestParam(value = "messageId",required = false)String messageIdStr,
            @RequestParam(value = "messageContent",required = false)String messageContent,
            @RequestParam(value = "targetId",required = false)String targetIdStr,
            @RequestParam(value = "sal",required = false)String salStr,
            @RequestParam(value = "deptAndJobId",required = false)String deptAndJobIdStr){
        String info = null;
        /*修改消息类型为入职消息*/
        int messageId = Integer.parseInt(messageIdStr);
        Message message = new Message();
        message.setMessageType(Message.NEW_EMPLOYEE_MESSAGE);
        boolean b = messageService.updateMessage(message);
        if(b){
            info="该用户已经被修改为：正式员工。";
        }else {
            info = "该用户入职消息记录，没有正确的修改。";
        }
        Empolyee empolyee = new Empolyee();
        int targetId = Integer.parseInt(targetIdStr);
        empolyee.setVisitorId(targetId);
        empolyee.setHiredate(TimeUtil.getTimeStamp());
        double sal = Double.parseDouble(salStr);
        empolyee.setSal(new BigDecimal(sal));
        int deptAndJobId = Integer.parseInt(deptAndJobIdStr);
        empolyee.setDeptAndJobId(deptAndJobId);
        boolean b1 = empolyeeService.addEmpolyee(empolyee);
        if (b1){
            info+="用户成功转换成员工！";
        }else{
            info+="用户没有正确的转换为员工，可能是工资或工作信息输入格式有误";
        }
        return info;
    }

    @RequestMapping("/empolyee.info")
    public   String   empolyeeInfo(){
        return "empolyee/success";
    }
}