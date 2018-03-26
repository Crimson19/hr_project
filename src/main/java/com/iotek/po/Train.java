package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Train implements Serializable {
    public static final String TRAIN_RESULT_BEST = "优秀";
    public static final String TRAIN_RESULT_MIDDLE = "中等";
    public static final String TRAIN_RESULT_LOW = "低";
    public static final String TRAIN_RESULT_NULL = "未评级";
    private Integer id;
    private String trainResult;
    private String trainContent;
    private Timestamp startTime;
    private Timestamp endTime;
    private String trainLocation;
    private String tutor;

    public Train() {
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public String getTrainContent() {
        return trainContent;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
    }

    public String getTrainLocation() {
        return trainLocation;
    }

    public void setTrainLocation(String trainLocation) {
        this.trainLocation = trainLocation;
    }

    public String getTrainResult() {
        return trainResult;
    }

    public void setTrainResult(String trainResult) {
        this.trainResult = trainResult;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", tutor='" + tutor + '\'' +
                ", trainContent='" + trainContent + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", trainLocation='" + trainLocation + '\'' +
                ", trainResult='" + trainResult + '\'' +
                '}';
    }
}