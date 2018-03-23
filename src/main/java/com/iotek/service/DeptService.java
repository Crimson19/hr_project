package com.iotek.service;

import com.iotek.po.Dept;

import java.util.List;

public interface DeptService {
    Dept findDeptByName(Dept dept);
    Dept updateDept(Dept dept);
    boolean addDept(Dept dept);
    boolean deleteDept(Dept dept);
    List<Dept> queryDept(Dept dept);
}