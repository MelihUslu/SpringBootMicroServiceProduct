package com.akis_yazilim.oracle.melih.product.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@SequenceGenerator(name = "PRODUCT_ID_SEQ", sequenceName = "PRODUCT_ID_SEQ", initialValue = 1, allocationSize = 1)
@Entity
public class Product
{
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_ID_SEQ")
    @Id
    private Integer productID;

     @Column(length = 80, nullable = false)
     private String name;

     @Column(length = 80, nullable = false)
     private String category;

     @Column(nullable = false)
     private double price;

     @Temporal(TemporalType.DATE)
     @Column(nullable = false)
     private Date created;

}
