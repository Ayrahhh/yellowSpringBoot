package com.example.YellowPagesSpringBoot.Repositories;

import java.util.List;

// import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.YellowPagesSpringBoot.Models.Company;

public interface CompanyRepository  extends JpaRepository<Company,Long>{
   // @Modifying
   @Query(value = "select c FROM Company c WHERE "+
   "c.companyName LIKE CONCAT('%',:search, '%')"+
   " or c.companyLocation LIKE CONCAT('%',:search, '%')"  )

   List<Company> searchCompanys(String search);


   public List<Company> findByCategory(String category);
}
