package com.iotek.service;

import com.iotek.po.EmpAndTrain;

import java.util.List;

public interface EmpAndTrainService {
    boolean addEAT(EmpAndTrain empAndTrain);
    boolean updateEAT(EmpAndTrain empAndTrain);
    List<EmpAndTrain> queryEAT(EmpAndTrain empAndTrain);
    boolean deleteEAT(EmpAndTrain empAndTrain);
}