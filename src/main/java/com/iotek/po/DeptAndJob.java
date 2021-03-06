package com.iotek.po;

import java.io.Serializable;

public class DeptAndJob implements Serializable {
    private Integer id;
    private Integer jobId;
    private Job job;
    private Integer deptId;
    private Dept dept;
    private Integer companyId;
    private Company company;


    public DeptAndJob() {

    }

    @Override
    public String toString() {
        return "DeptAndJob{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", job=" + job +
                ", deptId=" + deptId +
                ", dept=" + dept +
                ", companyId=" + companyId +
                ", company=" + company +
                '}';
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}