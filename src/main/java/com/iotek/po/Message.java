package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Message implements Serializable{
    public static Integer NOTICE_IS_DELETE = 1;
    public static Integer NOTICE_NOT_DELETE = 0;
    public static Integer NOTICE_NOT_READ = 0;
    public static Integer NOTICE_IS_READ = 1;
    public static String RECRUIT_MESSAGE = "求职消息";

    private Integer id;
    private String messageContent;
    private String messageType;
    private Integer senderId;
    private Integer targetId;
    private Timestamp createTime;
    private Integer isRead;
    private Integer isDeleted;

    public Message() {
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageContent='" + messageContent + '\'' +
                ", messageType='" + messageType + '\'' +
                ", senderId=" + senderId +
                ", targetId=" + targetId +
                ", createTime=" + createTime +
                ", isRead=" + isRead +
                ", isDeleted=" + isDeleted +
                '}';
    }
}