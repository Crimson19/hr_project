package com.iotek.dao;

import com.iotek.po.Visitor;

import java.util.List;

public interface VisitorDao {

    Visitor findVisitorByName(Visitor visitor);


    boolean addVisitor(Visitor visitor);

    boolean updateVisitor(Visitor visitor);

    List<Visitor> queryAllVisitor();

    Visitor findVisitorByid(int vid);

    List<Visitor> findLikeName(String name);

    int getCountVisitor();
    List<Visitor>  findVisitorList(List<Visitor> visitorList);


}