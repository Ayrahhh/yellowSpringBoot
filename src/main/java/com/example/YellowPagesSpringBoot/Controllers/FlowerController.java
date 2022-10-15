package com.example.YellowPagesSpringBoot.Controllers;

import java.util.List;

// import org.springdoc.core.ReturnTypeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.YellowPagesSpringBoot.Models.Flower;
import com.example.YellowPagesSpringBoot.services.FlowerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
     
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    @PostMapping("/post")
    public Flower post(@RequestBody Flower flower){
        return flowerService.add(flower);
    }

    @GetMapping("/get")
    public List<Flower> getAll(){
        return flowerService.getList();
    }

}

