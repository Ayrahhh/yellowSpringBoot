package com.example.YellowPagesSpringBoot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.YellowPagesSpringBoot.Models.Product;
import com.example.YellowPagesSpringBoot.services.ProductService;

@CrossOrigin
@RestController
@RequestMapping("api/v4")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getList();
    }

  

    @PostMapping("/products")
    
    public Product post(@RequestBody Product product){
        return productService.add(product);
    }

    @GetMapping("/Search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

  
}
