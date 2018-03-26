package com.iotek.controller;

import com.iotek.Util.TimeUtil;
import com.iotek.po.Admin;
import com.iotek.po.Message;
import com.iotek.po.Visitor;
import com.iotek.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "adminGetMessageNumRecruit.view")
    public Integer adminGetRecruitNum(HttpSession session){
        Admin admin = (Admin) session.getAttribute("admin");
        Message message = new Message();
        message.setTargetId(admin.getId());
        message.setMessageType(Message.RECRUIT_MESSAGE);
        message.setIsRead(Message.MESSAGE_NOT_READ);
        return messageService.queryMessage(message).size();
    }

    @RequestMapping(value = "adminGetMessageNumInterview.view")
    public Integer adminGetInterviewNum(HttpSession session){
        Admin admin = (Admin) session.getAttribute("admin");
        Message message = new Message();
        message.setTargetId(admin.getId());
        message.setMessageType(Message.INTERVIEW_MESSAGE);
        message.setIsRead(Message.MESSAGE_NOT_READ);
        return messageService.queryMessage(message).size();
    }

    @RequestMapping(value = "visitorViewMesssageNotRead.view")
    public String visitorShowMessage(HttpSession session,Model model){
        Visitor visiotr = (Visitor) session.getAttribute("visitor");
        Message message = new Message();
        message.setTargetId(visiotr.getId());
        message.setIsRead(Message.MESSAGE_NOT_READ);
        List<Message> messages = messageService.queryMessage(message);
        model.addAttribute("messageList",messages);
        return "message/visitorManageMessage";
    }

    @RequestMapping(value = "adminViewMessageNotRead.Recruit")
    public String adminShowMessageRecruit(HttpSession session,Model model){
        Admin admin = (Admin) session.getAttribute("admin");
        Message message = new Message();
        message.setTargetId(admin.getId());
        message.setMessageType(Message.RECRUIT_MESSAGE);
        message.setIsRead(Message.MESSAGE_NOT_READ);
        List<Message> messages = messageService.queryMessage(message);
        model.addAttribute("messageList",messages);
        return "message/adminManageMessageRecruitTowardInterview";
    }
    /*面试信息达到后，通知是否入职*/
    @RequestMapping(value = "adminViewMessageNotRead.interview")
    public String adminShowMessageInterview(HttpSession session,Model model){
        Admin admin = (Admin) session.getAttribute("admin");
        Message message = new Message();
        message.setTargetId(admin.getId());
        message.setMessageType(Message.INTERVIEW_MESSAGE);
        List<Message> messages = messageService.queryMessage(message);
        model.addAttribute("messageList",messages);
        return "message/adminManageMessageInterviewTowardEmpoly";
    }

    @RequestMapping(value = "delMessage.do")
    public String delMessage(@RequestParam(value = "messageId",required = false) String messageIdStr){
        int messageId = Integer.parseInt(messageIdStr);
        Message message = new Message();
        message.setId(messageId);
        message.setIsDeleted(Message.MESSAGE_IS_DELETE);
        boolean b = messageService.updateMessage(message);
        String info = null;
        if(b){
            info ="删除成功";
        }else{
            info = "删除失败";
        }
        return info;
    }

    @RequestMapping(value = "readMessage.do")
    public String readMessage(@RequestParam(value = "messageId",required = false) String messageIdStr){
        int messageId = Integer.parseInt(messageIdStr);
        Message message = new Message();
        message.setId(messageId);
        message.setIsDeleted(Message.MESSAGE_IS_READ);
        boolean b = messageService.updateMessage(message);
        String info = null;
        if(b){
            info ="消息已读";
        }else{
            info = "消息未读";
        }
        return info;
    }
    @RequestMapping(value = "adminSendInterview.do")
    public String adminSendInterview( @RequestParam(value = "messageContent",required = false) String messageContent,
                                      @RequestParam(value = "messageTargetId",required = false)String targetIdStr){
        Message message = new Message();
        message.setMessageType(Message.INTERVIEW_MESSAGE);
        message.setCreateTime(TimeUtil.getTimeStamp());
        message.setMessageContent(messageContent);
        int targetId = Integer.parseInt(targetIdStr);
        message.setTargetId(targetId);
        boolean b = messageService.addMessage(message);
        String info = null;
        if(b){
            info = "面试通知发送完毕！";
        }else{
            info = "面试通知发送失败！";
        }
        return info;
    }
}