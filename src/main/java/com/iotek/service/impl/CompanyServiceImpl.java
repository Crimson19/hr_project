package com.iotek.service.impl;

import com.iotek.dao.CompanyDao;
import com.iotek.po.Company;
import com.iotek.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "companyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public boolean addCompany(Company company) {
        return companyDao.addCompany(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyDao.updateCompany(company);
    }

    @Override
    public Company queryCompany(Company company) {
        return companyDao.queryCompany(company);
    }

    @Override
    public Company queryCompanyById(Integer id) {
        return companyDao.queryCompanyById(id);
    }
}