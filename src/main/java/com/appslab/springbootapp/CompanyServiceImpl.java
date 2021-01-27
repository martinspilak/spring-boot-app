package com.appslab.springbootapp;

public class CompanyServiceImpl implements CompanyService{
    CompanyRepository companyRepository;

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
