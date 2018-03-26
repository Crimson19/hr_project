package com.iotek.service;

import com.iotek.po.Train;

import java.util.List;

public interface TrainService {
    boolean addTrain(Train train);
    boolean updateTrain(Train train);
    List<Train> queryTrain(Train train);
}