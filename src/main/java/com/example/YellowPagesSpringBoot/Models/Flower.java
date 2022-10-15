package com.example.YellowPagesSpringBoot.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity

public class Flower {
   @javax.persistence.Id 
   @GeneratedValue(strategy =GenerationType.IDENTITY)
    public Long Id;
    public String firstname;
    public String lastname;
    public String address;
    public String phonenumber;


}
