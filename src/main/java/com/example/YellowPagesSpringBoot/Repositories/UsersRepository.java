package com.example.YellowPagesSpringBoot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.YellowPagesSpringBoot.Models.Users;

public interface UsersRepository  extends JpaRepository<Users,Long>{
    
}
