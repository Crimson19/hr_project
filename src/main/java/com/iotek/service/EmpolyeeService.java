package com.iotek.service;

import com.iotek.po.Empolyee;

public interface EmpolyeeService {
    Empolyee findEmpolyeeByVId(int vid);
    boolean addEmpolyee(Empolyee empolyee);
}