package com.iotek.service;

import com.iotek.po.Dept;

public interface DeptService {
    Dept findDeptByName(Dept dept);
    boolean updateDept(Dept dept);
    boolean addDept(Dept dept);
}