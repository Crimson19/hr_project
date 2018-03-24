package com.iotek.controller;


import com.iotek.Util.TimeUtil;
import com.iotek.po.Message;
import com.iotek.po.Recruit;
import com.iotek.po.Resume;
import com.iotek.po.Visitor;
import com.iotek.service.MessageService;
import com.iotek.service.RecruitService;
import com.iotek.service.ResumeServive;
import com.iotek.service.impl.MessageServiceImpl;
import com.iotek.service.impl.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/resume")
public class ResumeController {

    @Autowired
    private ResumeServive resumeService;

    @Autowired
    private RecruitService recruitService;
    @Autowired
    private MessageService messageService;


    @RequestMapping(value = "/index.view")
    public   String   indexPage(){
        return "resume/index";
    }

    @RequestMapping(value = "/addResume.view/{recId}/{createrId}")
    public   String   addResumePage(Model model, @PathVariable(value = "recId") String recId, @PathVariable(value = "createrId") String createrId){
        int recIdInt = Integer.parseInt(recId);
        int createrIdInt = Integer.parseInt(createrId);
        model.addAttribute("recId",recIdInt);
        model.addAttribute("createrId",createrIdInt);
        Recruit recruit = new Recruit();
        recruit.setId(recIdInt);
        List<Recruit> recruits = recruitService.queryRecruit(recruit);
        model.addAttribute("recruit",recruits.get(0));
        return "resume/addResume";
    }

    @RequestMapping(value = "/addResume.do")
    public   String   recruitAdditon(@RequestParam(value = "messageContent",required = false) String messageContent, @ModelAttribute Resume resume, HttpSession session, Model model, @RequestParam(value = "createrId")Integer createrId){

        Visitor visitor = (Visitor) session.getAttribute("visitor");
        int vId = visitor.getId();
        resume.setVisitorId(vId);
        boolean flag = resumeService.addResume(resume);
        if(!flag){
            model.addAttribute("info","失败");
            return "visitor/success";
        }
        /*消息*/
        Message message = new Message();
        message.setSenderId(vId);
        message.setTargetId(createrId);
        /*Recruitment表中拼接“职位、部门、公司”作为notice的content*/
        message.setMessageContent(messageContent);
        message.setMessageType(message.RECRUIT_MESSAGE);
        message.setCreateTime(TimeUtil.getTimeStamp());
        boolean flag2 = messageService.addMessage(message);
        /*反馈给发送的访客*/
        if (!flag2){
            model.addAttribute("info","消息发送失败");
            return "visitor/success";
        }
        model.addAttribute("resume",resume);
        model.addAttribute("message",message);
        return "visitor/success";
    }
}