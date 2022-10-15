package com.example.YellowPagesSpringBoot.Models;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Table;

import lombok.Data;

// @Table
@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String companyName;
    private String companyLocation;
    private String companyEmail;
    private String companyPhonenumber;
    private String url;
    private String category;

    // @Column(length=50000000)
    // private byte[] picByte;

    // public

    // @Column(length = 50000000)
    // private byte[] picByte;
}
