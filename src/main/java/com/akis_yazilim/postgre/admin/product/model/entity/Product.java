package com.akis_yazilim.postgre.admin.product.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@SequenceGenerator(name = "PRODUCT_ID_SEQUENCE", sequenceName = "PRODUCT_ID_SEQ", initialValue = 1, allocationSize = 1)
@Table(name ="PRODUCTS")
@Entity
public class Product
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_ID_SEQUENCE")
    @Column(name = "PRODUCT_ID")
    @Id
    private Integer productID;

    @Column(length = 120, nullable = false)
    private String name;


    private String description;

    @Column(length = 80, nullable = false)
    private String category;

    @Column(nullable = false)
    private Double price;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date created;
}
