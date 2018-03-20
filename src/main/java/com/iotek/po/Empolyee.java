package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Empolyee implements Serializable {
    private Integer id;
    private Integer visitorId;
    private Integer deptAndJobId;
    private BigDecimal sal;
    private Timestamp hiredate;
    private Timestamp firedate;
    private Timestamp modifiedTime;

    public Empolyee() {
    }

    public Integer getDeptAndJobId() {
        return deptAndJobId;
    }

    public void setDeptAndJobId(Integer deptAndJobId) {
        this.deptAndJobId = deptAndJobId;
    }

    public Timestamp getFiredate() {
        return firedate;
    }

    public void setFiredate(Timestamp firedate) {
        this.firedate = firedate;
    }

    public Timestamp getHiredate() {
        return hiredate;
    }

    public void setHiredate(Timestamp hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", deptAndJobId=" + deptAndJobId +
                ", visitorId=" + visitorId +
                ", sal=" + sal +
                ", hiredate=" + hiredate +
                ", firedate=" + firedate +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}