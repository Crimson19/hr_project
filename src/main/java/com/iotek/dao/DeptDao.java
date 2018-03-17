package com.iotek.dao;

import com.iotek.po.Dept;

public interface DeptDao {
    Dept findDeptByName(Dept dept);
    boolean updateDept(Dept dept);
    boolean addDept(Dept dept);
}