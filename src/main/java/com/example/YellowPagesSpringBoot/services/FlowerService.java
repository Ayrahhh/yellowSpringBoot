package com.example.YellowPagesSpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YellowPagesSpringBoot.Models.Flower;
import com.example.YellowPagesSpringBoot.Repositories.FlowerRepository;

@Service
public class FlowerService {
    
  @Autowired
  private FlowerRepository flowerRepository;


  public Flower add(Flower flower){
    return flowerRepository.save(flower);
}

    public  List<Flower> getList(){
        return flowerRepository.findAll();
    }

    public void delete(long id){
        flowerRepository.findById(id);

    }
}
