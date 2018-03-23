package com.iotek.dao;

import com.iotek.po.Company;

public interface CompanyDao {
    boolean addCompany(Company company);
    Company updateCompany(Company company);
    Company queryCompany(Company company);
    Company queryCompanyById(Integer id);
}