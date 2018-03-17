package com.iotek.service.impl;

import com.iotek.dao.AdminDao;
import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin queryAdminByName(Admin admin) {
        if (admin == null) {
            return   null;
        }

        return adminDao.findAdminByName(admin);
    }

    @Override
    public boolean addAdmin(Admin admin) {
        if (admin == null) {
            return   false;
        }

        return adminDao.addAdmin(admin);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return false;
    }

    @Override
    public List<Admin> queryAllAdmin() {
        return null;
    }

    @Override
    public Admin findAdminByid(int aid) {
        return null;
    }

    @Override
    public List<Admin> findLikeName(String name) {
        return null;
    }

    @Override
    public List<Admin> findAdminList(List<Admin> adminList) {
        return null;
    }
}