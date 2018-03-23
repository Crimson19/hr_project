package com.iotek.service.impl;

import com.iotek.dao.DeptAndJobDao;
import com.iotek.po.DeptAndJob;
import com.iotek.service.DeptAndJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deptAndJobService")
public class DeptAndJobServiceImpl implements DeptAndJobService {

    @Autowired
    private DeptAndJobDao deptAndJobDao;

    @Override
    public boolean addDeptAndJob(DeptAndJob deptAndJob) {
        return deptAndJobDao.addDeptAndJob(deptAndJob);
    }

    @Override
    public DeptAndJob updateDeptAndJob(DeptAndJob deptAndJob) {
        return deptAndJobDao.updateDeptAndJob(deptAndJob);
    }

    @Override
    public List<DeptAndJob> queryDeptAndJob(DeptAndJob deptAndJob) {

        return deptAndJobDao.queryDeptAndJob(deptAndJob);
    }
}