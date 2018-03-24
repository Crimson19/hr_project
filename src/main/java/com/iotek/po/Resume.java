package com.iotek.po;

import java.io.Serializable;
import java.util.List;

public class Resume implements Serializable {
    private Integer id;
    private Integer visitorId;
    private String intersets;
    private String selfAppraisal;
    private Integer recruitId;

    public Resume() {
    }

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntersets() {
        return intersets;
    }

    public void setIntersets(String intersets) {
        this.intersets = intersets;
    }

    public String getSelfAppraisal() {
        return selfAppraisal;
    }

    public void setSelfAppraisal(String selfAppraisal) {
        this.selfAppraisal = selfAppraisal;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", visitorId=" + visitorId +
                ", intersets='" + intersets + '\'' +
                ", selfAppraisal='" + selfAppraisal + '\'' +
                ", recruitId=" + recruitId +
                '}';
    }
}