package com.iotek.dao;

import com.iotek.po.Empolyee;

import java.util.List;

public interface EmpolyeeDao {
    boolean updateEmp(Empolyee empolyee);
    List<Empolyee> queryEmp(Empolyee empolyee);
    boolean addEmpolyee(Empolyee empolyee);
}