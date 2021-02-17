package com.appslab.springbootapp.Company;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    @GetMapping("/company")
    public void Company(Company company){
        companyService.saveCompany(company);}


    }



