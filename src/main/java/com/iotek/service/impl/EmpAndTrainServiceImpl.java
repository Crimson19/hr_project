package com.iotek.service.impl;

import com.iotek.dao.EmpAndTrainDao;
import com.iotek.po.EmpAndTrain;
import com.iotek.service.EmpAndTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "empAndTrainService")
public class EmpAndTrainServiceImpl implements EmpAndTrainService{
    @Autowired
    private EmpAndTrainDao empAndTrainDao;
    @Override
    public boolean addEAT(EmpAndTrain empAndTrain) {
        return empAndTrainDao.addEAT(empAndTrain);
    }

    @Override
    public boolean updateEAT(EmpAndTrain empAndTrain) {
        return empAndTrainDao.updateEAT(empAndTrain);
    }

    @Override
    public List<EmpAndTrain> queryEAT(EmpAndTrain empAndTrain) {
        return empAndTrainDao.queryEAT(empAndTrain);
    }

    @Override
    public boolean deleteEAT(EmpAndTrain empAndTrain) {
        return empAndTrainDao.deleteEAT(empAndTrain);
    }
}