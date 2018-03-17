package com.iotek.dao;

import com.iotek.po.Admin;

import java.util.List;

public interface AdminDao {
    Admin findAdminByName(Admin admin);
    boolean addAdmin(Admin admin);

    boolean updateAdmin(Admin admin);

    List<Admin> queryAllAdmin();

    Admin findAdminByid(int aid);

    List<Admin> findLikeName(String name);

    int getCountAdmin();
    List<Admin>  findAdminList(List<Admin> adminList);
}