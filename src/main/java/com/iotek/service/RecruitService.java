package com.iotek.service;

import com.iotek.po.Recruit;

import java.util.List;

public interface RecruitService {
    boolean addRecruit(Recruit recruit);

    boolean updateRecruit(Recruit recruit);

    List<Recruit> queryAllRecruit();
}