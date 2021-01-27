package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    @PostMapping(value = "/postCompany")
    public void postCompany(@RequestBody Company company){
        companyService.saveCompany(company);
}
}

