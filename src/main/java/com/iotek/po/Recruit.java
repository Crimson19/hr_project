package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Recruit implements Serializable {
    private Integer id;
    private Integer jobId;
    private String workType;
    private String location;
    private Integer recruitNumber;
    private Timestamp createTime;

    public Recruit() {
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

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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
                ", jobId=" + jobId +
                ", workType='" + workType + '\'' +
                ", location='" + location + '\'' +
                ", recruitNumber=" + recruitNumber +
                ", createTime=" + createTime +
                '}';
    }
}