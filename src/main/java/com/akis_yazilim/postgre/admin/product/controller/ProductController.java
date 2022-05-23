package com.akis_yazilim.postgre.admin.product.controller;

import com.akis_yazilim.postgre.admin.product.model.entity.Product;
import com.akis_yazilim.postgre.admin.product.model.service.AbstractProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/product")
@RestController
public class ProductController
{
    @Autowired
    private AbstractProductService productService;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product)
    {
         Product savedProduct = productService.save(product);

         return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("{productID}")
    public ResponseEntity delete(@PathVariable Integer productID)
    {
        productService.deleteByID(productID);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll()
    {
        List<Product> productList = productService.findAll();

        return  ResponseEntity.ok(productList);

    }
}

