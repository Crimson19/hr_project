package com.iotek.controller;


import com.iotek.po.Attendance;
import com.iotek.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "/addAttendance.do")
    public   String   attendanceAdditon(@ModelAttribute Attendance attendance, HttpSession session, Model model){

//        System.out.println("增加之前："+jobType);
        boolean addFlag = attendanceService.addAttendance(attendance);
//        System.out.println("增加之后："+jobType);
        if (addFlag){
            model.addAttribute("info","打卡成功");
            session.setAttribute("attendance",attendance);
            return "admin/success";

        }
        model.addAttribute("info","打卡失败");
        return  "company/index";

    }
}