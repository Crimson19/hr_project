package com.iotek.service;

import com.iotek.po.Company;

public interface CompanyService {
    boolean addCompany(Company company);
    Company updateCompany(Company company);
    Company queryCompany(Company company);
    Company queryCompanyById(Integer id);
}