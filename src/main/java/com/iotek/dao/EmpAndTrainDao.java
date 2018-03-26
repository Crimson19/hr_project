package com.iotek.dao;

import com.iotek.po.EmpAndTrain;

import java.util.List;

public interface EmpAndTrainDao {
    boolean addEAT(EmpAndTrain empAndTrain);
    boolean updateEAT(EmpAndTrain empAndTrain);
    List<EmpAndTrain> queryEAT(EmpAndTrain empAndTrain);
    boolean deleteEAT(EmpAndTrain empAndTrain);
}