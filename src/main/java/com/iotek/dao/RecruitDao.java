package com.iotek.dao;

import com.iotek.po.Recruit;

import java.util.List;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);

    boolean updateRecruit(Recruit recruit);

    List<Recruit> queryAllRecruit();
}