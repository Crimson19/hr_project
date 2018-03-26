package com.iotek.service;

import com.iotek.po.Empolyee;

import java.util.List;

public interface EmpolyeeService {
    boolean updateEmp(Empolyee empolyee);
    List<Empolyee> queryEmp(Empolyee empolyee);
    boolean addEmpolyee(Empolyee empolyee);
}