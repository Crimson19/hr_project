package com.iotek.service.impl;

import com.iotek.dao.AttendanceDao;
import com.iotek.po.Attendance;
import com.iotek.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "attendanceService")
public class AttendanceServiceImpl implements AttendanceService{

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public boolean addAttendance(Attendance attendance) {
        if (attendance == null) {
            return false;
        }
        return attendanceDao.addAttendance(attendance);
    }

    @Override
    public boolean updateAttendance(Attendance attendance) {
        if (attendance == null) {
            return false;
        }
        return attendanceDao.updateAttendance(attendance);
    }

    @Override
    public List<Attendance> queryAttendance(Attendance attendance) {
        return attendanceDao.queryAttendance(attendance);
    }

    @Override
    public Attendance findAttendanceByid(int eid) {
        return attendanceDao.findAttendanceByid(eid);
    }
}