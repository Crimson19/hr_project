package com.iotek.service.impl;

import com.iotek.dao.RecruitDao;
import com.iotek.po.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "recruitService")
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitDao recruitDao;

    @Override
    public boolean addRecruit(Recruit recruit) {
        if (recruit == null) {
            return  false;
        }

        return recruitDao.addRecruit(recruit);
    }

    @Override
    public boolean updateRecruit(Recruit recruit) {
        if (recruit == null) {
            return  false;
        }
        return    recruitDao.updateRecruit(recruit);
    }

    @Override
    public List<Recruit> queryAllRecruit() {
        return null;
    }
}