package com.iotek.service.impl;

import com.iotek.Util.TimeUtil;
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
        recruit.setCreateTime(TimeUtil.getTimeStamp());
        return recruitDao.addRecruit(recruit);
    }

    @Override
    public Recruit updateRecruit(Recruit recruit) {
        return    recruitDao.updateRecruit(recruit);
    }

    @Override
    public List<Recruit> queryRecruit(Recruit recruit) {
        return recruitDao.queryRecruit(recruit);
    }

    @Override
    public boolean deleteRecruit(Recruit recruit) {
        return recruitDao.deleteRecruit(recruit);
    }
}