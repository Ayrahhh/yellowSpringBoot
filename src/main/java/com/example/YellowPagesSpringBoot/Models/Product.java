package com.example.YellowPagesSpringBoot.Models;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    private String productName;
    private String productDescription;
    private String productPrice;

//     @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
// @JoinTable(name = "COMP_PROD",joinColumns = {
//     @JoinColumn(name="companyId")
// }, inverseJoinColumns = {
//     @JoinColumn(name = "productId")
// })
// private Set<Company> company;

@ManyToOne
Company company;
}


