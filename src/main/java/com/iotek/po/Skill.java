package com.iotek.po;

import java.io.Serializable;

public class Skill implements Serializable {
    private Integer id;
    private Integer visitorId;
    private String skillName;
    private String skillCertificate;

    public Skill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillCertificate() {
        return skillCertificate;
    }

    public void setSkillCertificate(String skillCertificate) {
        this.skillCertificate = skillCertificate;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", visitorId=" + visitorId +
                ", skillName='" + skillName + '\'' +
                ", skillCertificate='" + skillCertificate + '\'' +
                '}';
    }
}