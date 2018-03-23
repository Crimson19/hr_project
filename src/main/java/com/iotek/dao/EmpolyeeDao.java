package com.iotek.dao;

import com.iotek.po.Empolyee;

public interface EmpolyeeDao {
    Empolyee findEmpolyeeByVId(int vid);
    boolean addEmpolyee(Empolyee empolyee);
}