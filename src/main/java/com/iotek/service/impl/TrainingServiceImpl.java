package com.iotek.service.impl;

import com.iotek.dao.TrainingDao;
import com.iotek.po.Training;
import com.iotek.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "trainingService")
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingDao trainingDao;

    @Override
    public boolean addTraining(Training training) {
        if (training== null) {
            return   false;
        }
        return trainingDao.addTraining(training);
    }
}