package com.example.YellowPagesSpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YellowPagesSpringBoot.Models.Product;
import com.example.YellowPagesSpringBoot.Repositories.ProductRepository;

@Service
public class ProductService {
  
    @Autowired
    private ProductRepository productRepository;
     
    public Product add(Product product){
        return productRepository.save(product);
    }

    public List<Product> getList(){
        return productRepository.findAll();
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }

    public Product getbyId(long id){
         return productRepository.findById(id).get();
        
    }

    public List<Product> searchProducts(String query){
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }
}
