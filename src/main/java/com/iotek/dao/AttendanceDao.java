package com.iotek.dao;

import com.iotek.po.Attendance;

import java.util.List;

public interface AttendanceDao {
    boolean addAttendance(Attendance attendance);

    boolean updateAttendance(Attendance attendance);

    List<Attendance> queryAttendance(Attendance attendance);

    Attendance findAttendanceByid(int eid);
}