package com.iotek.service.impl;

import com.iotek.dao.DeptDao;
import com.iotek.po.Dept;
import com.iotek.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deptService")
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept findDeptByName(Dept dept) {
        if (dept== null) {
            return   null;
        }
        return deptDao.findDeptByName(dept);
    }

    @Override
    public Dept updateDept(Dept dept) {
        if (dept == null) {
            return null;
        }
        return deptDao.updateDept(dept);
    }

    @Override
    public boolean addDept(Dept dept) {
        if (dept == null) {
            return  false;
        }
        return    deptDao.addDept(dept);
    }

    @Override
    public boolean deleteDept(Dept dept) {
        return deptDao.deleteDept(dept);
    }

    @Override
    public List<Dept> queryDept(Dept dept) {
        return deptDao.queryDept(dept);
    }
}