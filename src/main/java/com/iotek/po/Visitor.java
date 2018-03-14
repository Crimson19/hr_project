package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Visitor implements Serializable {
    private  Integer  id;
    private String visitorName;
    private  transient String visitorPassword;
    private String visitorGender;
    private Integer visitorAge;
    private String visitorEmail;
    private String visitorPhone;
    private String visitorPhoto;
    private Timestamp customerCreateTime;
    private Timestamp customerModifiedTime;

    public Visitor(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorPassword() {
        return visitorPassword;
    }

    public void setVisitorPassword(String visitorPassword) {
        this.visitorPassword = visitorPassword;
    }

    public Integer getVisitorAge() {
        return visitorAge;
    }

    public void setVisitorAge(Integer visitorAge) {
        this.visitorAge = visitorAge;
    }

    public String getVisitorGender() {
        return visitorGender;
    }

    public void setVisitorGender(String visitorGender) {
        this.visitorGender = visitorGender;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone;
    }

    public String getVisitorPhoto() {
        return visitorPhoto;
    }

    public void setVisitorPhoto(String visitorPhoto) {
        this.visitorPhoto = visitorPhoto;
    }

    public Timestamp getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Timestamp customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Timestamp getCustomerModifiedTime() {
        return customerModifiedTime;
    }

    public void setCustomerModifiedTime(Timestamp customerModifiedTime) {
        this.customerModifiedTime = customerModifiedTime;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", visitorName='" + visitorName + '\'' +
                ", visitorPassword='" + visitorPassword + '\'' +
                ", visitorGender='" + visitorGender + '\'' +
                ", visitorAge=" + visitorAge +
                ", visitorEmail='" + visitorEmail + '\'' +
                ", visitorPhone='" + visitorPhone + '\'' +
                ", visitorPhoto='" + visitorPhoto + '\'' +
                ", customerCreateTime=" + customerCreateTime +
                ", customerModifiedTime=" + customerModifiedTime +
                '}';
    }
}