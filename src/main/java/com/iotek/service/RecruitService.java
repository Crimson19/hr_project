package com.iotek.service;

import com.iotek.po.Recruit;

import java.util.List;

public interface RecruitService {
    boolean addRecruit(Recruit recruit);

    Recruit updateRecruit(Recruit recruit);

    List<Recruit> queryRecruit(Recruit recruit);

    boolean deleteRecruit(Recruit recruit);
}