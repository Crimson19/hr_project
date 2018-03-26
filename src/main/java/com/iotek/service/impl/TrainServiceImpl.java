package com.iotek.service.impl;

import com.iotek.dao.TrainDao;
import com.iotek.po.Train;
import com.iotek.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "trainService")
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainDao trainDao;

    @Override
    public boolean addTrain(Train train) {
        if (train == null) {
            return   false;
        }
        return trainDao.addTrain(train);
    }

    @Override
    public boolean updateTrain(Train train) {
        return trainDao.updateTrain(train);
    }

    @Override
    public List<Train> queryTrain(Train train) {
        return trainDao.queryTrain(train);
    }
}