package com.iotek.service.impl;

import com.iotek.dao.EmpolyeeDao;
import com.iotek.po.Empolyee;
import com.iotek.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "empolyeeService")
public class EmpolyeeServiceImpl implements EmpolyeeService {
    @Autowired
    private EmpolyeeDao empolyeeDao;
    @Override
    public Empolyee findEmpolyeeByVId(int vid) {
        return empolyeeDao.findEmpolyeeByVId(vid);
    }

    @Override
    public boolean addEmpolyee(Empolyee empolyee) {
        if (empolyee == null){
            return false;
        }
        return empolyeeDao.addEmpolyee(empolyee);
    }
}