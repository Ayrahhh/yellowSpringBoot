package com.example.YellowPagesSpringBoot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.YellowPagesSpringBoot.Models.Users;
import com.example.YellowPagesSpringBoot.Repositories.UsersRepository;


@RestController
@RequestMapping("api/v2")
public class UsersController {
    
    @Autowired
    private UsersRepository userRepository;

    @GetMapping("/user")
    public List<Users> getAl(){
        return userRepository.findAll();
    }
}
