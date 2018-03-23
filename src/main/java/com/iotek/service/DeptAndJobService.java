package com.iotek.service;

import com.iotek.po.DeptAndJob;

import java.util.List;

public interface DeptAndJobService {
    boolean addDeptAndJob(DeptAndJob deptAndJob);
    DeptAndJob updateDeptAndJob(DeptAndJob deptAndJob);
    List<DeptAndJob> queryDeptAndJob(DeptAndJob deptAndJob);
}