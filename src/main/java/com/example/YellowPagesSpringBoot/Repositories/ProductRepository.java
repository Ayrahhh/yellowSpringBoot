package com.example.YellowPagesSpringBoot.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.YellowPagesSpringBoot.Models.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT P from Product p WHERE "+ 
    "p.productName LIKE CONCAT('%',:query, '%')" +
    " or p.productDescription LIKE CONCAT('%',:query, '%')", nativeQuery = true)
    
    List<Product> searchProducts(String query);
}

