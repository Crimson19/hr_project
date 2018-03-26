package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Attendance implements Serializable {

    private Integer id;
    private Integer empId;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer status;
    private Empolyee empolyee;

    public Attendance() {
    }

    public Empolyee getEmpolyee() {
        return empolyee;
    }

    public void setEmpolyee(Empolyee empolyee) {
        this.empolyee = empolyee;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AttendanceDao{" +
                "id=" + id +
                ", empId=" + empId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", empolyee=" + empolyee +
                '}';
    }
}