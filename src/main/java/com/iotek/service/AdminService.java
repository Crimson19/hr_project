package com.iotek.service;

import com.iotek.po.Admin;

import java.util.List;

public interface AdminService {
    Admin queryAdminByName(Admin admin);

    boolean   addAdmin(Admin admin);

    boolean   updateAdmin(Admin admin);
    List<Admin> queryAllAdmin();

    Admin  findAdminByid(int aid);

    List<Admin>  findLikeName(String name);
    List<Admin>  findAdminList(List<Admin> adminList);
}