package com.iotek.dao;

import com.iotek.po.Dept;

import java.util.List;

public interface DeptDao {
    Dept findDeptByName(Dept dept);
    Dept updateDept(Dept dept);
    boolean addDept(Dept dept);
    boolean deleteDept(Dept dept);
    List<Dept> queryDept(Dept dept);
}