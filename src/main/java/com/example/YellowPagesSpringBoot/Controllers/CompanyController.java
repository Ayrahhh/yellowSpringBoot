package com.example.YellowPagesSpringBoot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.YellowPagesSpringBoot.Models.Company;
import com.example.YellowPagesSpringBoot.services.CompanyService;


@CrossOrigin
@RestController
@RequestMapping("api/v4")
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @PostMapping("/post")
    public Company post(@RequestBody Company company){
        return companyService.add(company);
    }
    @GetMapping("/get")
    public List<Company> getAll(){
        return companyService.getList();
    }

    @GetMapping("get/{id}")
    public Company getbyid(@PathVariable(value = "id")long id){
        return companyService.getbyId(id);
        
    }

    @GetMapping("/category/{category}")
    public List<Company> getByCategory(@PathVariable String category){
        return companyService.getByCategory(category);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Company>> searchCompanys(@PathVariable("search") String query){
        return ResponseEntity.ok(companyService.searchCompanys(query));
    }

}



 