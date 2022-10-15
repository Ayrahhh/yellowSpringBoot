package com.example.YellowPagesSpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YellowPagesSpringBoot.Models.Company;
import com.example.YellowPagesSpringBoot.Repositories.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
     
    public Company add(Company company){
        return companyRepository.save(company);
    }

    public List<Company> getList(){
        return companyRepository.findAll();
    }

    public void delete(long id){
        companyRepository.deleteById(id);
    }

    public Company getbyId(long id){
         return companyRepository.findById(id).get();
        
    }

    public List<Company> getByCategory(String category){
        return companyRepository.findByCategory(category);
    }

    public List<Company> searchCompanys(String query){
        List<Company> companys =companyRepository.searchCompanys(query);
        return companys;
}

}
