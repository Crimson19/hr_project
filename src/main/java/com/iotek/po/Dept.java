package com.iotek.po;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer id;
    private Integer companyId;
    private String deptName;
    private String deptInfo;

    public Dept() {
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(String deptInfo) {
        this.deptInfo = deptInfo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", deptName='" + deptName + '\'' +
                ", deptInfo='" + deptInfo + '\'' +
                '}';
    }
}