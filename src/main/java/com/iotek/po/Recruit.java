package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Recruit implements Serializable {
    private Integer id;
    private Integer deptAndJobId;
    private String workType;
    private String location;
    private Integer recruitNumber;
    private Timestamp createTime;
    private DeptAndJob deptAndJob;
    private Integer createrId;
    private List<Resume> resumeList;

    public Recruit() {
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public DeptAndJob getDeptAndJob() {
        return deptAndJob;
    }

    public void setDeptAndJob(DeptAndJob deptAndJob) {
        this.deptAndJob = deptAndJob;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptAndJobId() {
        return deptAndJobId;
    }

    public void setDeptAndJobId(Integer deptAndJobId) {
        this.deptAndJobId = deptAndJobId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getRecruitNumber() {
        return recruitNumber;
    }

    public void setRecruitNumber(Integer recruitNumber) {
        this.recruitNumber = recruitNumber;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", deptAndJobId=" + deptAndJobId +
                ", workType='" + workType + '\'' +
                ", location='" + location + '\'' +
                ", recruitNumber=" + recruitNumber +
                ", createTime=" + createTime +
                ", deptAndJob=" + deptAndJob +
                ", createrId=" + createrId +
                ", resumeList=" + resumeList +
                '}';
    }
}