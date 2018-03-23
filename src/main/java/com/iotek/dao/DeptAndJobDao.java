package com.iotek.dao;

import com.iotek.po.DeptAndJob;

import java.util.List;

public interface DeptAndJobDao {
    boolean addDeptAndJob(DeptAndJob deptAndJob);
    DeptAndJob updateDeptAndJob(DeptAndJob deptAndJob);
    List<DeptAndJob> queryDeptAndJob(DeptAndJob deptAndJob);
}