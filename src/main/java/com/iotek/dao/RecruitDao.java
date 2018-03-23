package com.iotek.dao;

import com.iotek.po.Recruit;

import java.util.List;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);

    Recruit updateRecruit(Recruit recruit);

    List<Recruit> queryRecruit(Recruit recruit);

    boolean deleteRecruit(Recruit recruit);
}