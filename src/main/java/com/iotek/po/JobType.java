package com.iotek.po;

import java.io.Serializable;

public class JobType implements Serializable {

    private Integer id;
    private String jobType1;
    private String jobType2;

    public JobType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobType1() {
        return jobType1;
    }

    public void setJobType1(String jobType1) {
        this.jobType1 = jobType1;
    }

    public String getJobType2() {
        return jobType2;
    }

    public void setJobType2(String jobType2) {
        this.jobType2 = jobType2;
    }

    @Override
    public String toString() {
        return "JobType{" +
                "id=" + id +
                ", jobType1='" + jobType1 + '\'' +
                ", jobType2='" + jobType2 + '\'' +
                '}';
    }
}