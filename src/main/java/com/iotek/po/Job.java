package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class Job implements Serializable{
    private Integer id;
    private Integer deptId;
    private Integer jobTypeId;
    private String jobName;
    private String jobInfo;
    private BigDecimal sal;

    public Job() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getJobTypeId() {
        return jobTypeId;
    }

    public void setJobTypeId(Integer jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", deptId=" + deptId +
                ", jobTypeId=" + jobTypeId +
                ", jobName='" + jobName + '\'' +
                ", jobInfo='" + jobInfo + '\'' +
                ", sal=" + sal +
                '}';
    }
}