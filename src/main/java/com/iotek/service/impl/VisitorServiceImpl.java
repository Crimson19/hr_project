package com.iotek.service.impl;

import com.iotek.dao.VisitorDao;
import com.iotek.po.Visitor;
import com.iotek.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "visitorService")
public class VisitorServiceImpl implements VisitorService{
    @Autowired
    private VisitorDao visitorDao;

    @Override
    public Visitor queryVisitorByName(Visitor visitor) {
        if (visitor == null) {
            return   null;
        }

        return visitorDao.findVisitorByName(visitor);
    }

    @Override
    public boolean addVisitor(Visitor visitor) {
        if (visitor == null) {
            return  false;
        }
        return    visitorDao.addVisitor(visitor);
    }

    @Override
    public boolean updateVisitor(Visitor visitor) {
        if (visitor == null) {
            return  false;
        }
        return    visitorDao.updateVisitor(visitor);
    }

    @Override
    public List<Visitor> queryAllVisitor() {
        return null;
    }

    @Override
    public Visitor findVisitorByid(int vid) {
        return null;
    }

    @Override
    public List<Visitor> findLikeName(String name) {
        return null;
    }

    @Override
    public List<Visitor> findVisitorList(List<Visitor> visitorList) {
        return null;
    }
}