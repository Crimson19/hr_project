package com.iotek.service;

import com.iotek.po.Visitor;

import java.util.List;

public interface VisitorService {
    Visitor queryVisitorByName(Visitor visitor);

    boolean   addVisitor(Visitor visitor);

    boolean   updateVisitor(Visitor visitor);
    List<Visitor> queryAllVisitor();

    Visitor  findVisitorByid(int vid);

    List<Visitor>  findLikeName(String name);
    List<Visitor>  findVisitorList(List<Visitor> visitorList);

}