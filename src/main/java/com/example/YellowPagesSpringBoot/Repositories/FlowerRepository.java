package com.example.YellowPagesSpringBoot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.YellowPagesSpringBoot.Models.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}
