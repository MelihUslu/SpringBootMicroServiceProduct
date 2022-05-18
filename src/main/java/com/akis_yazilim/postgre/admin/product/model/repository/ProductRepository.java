package com.akis_yazilim.oracle.melih.product.model.repository;

import com.akis_yazilim.oracle.melih.product.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    // SELECT * FROM PRODUCTS WHERE PRICE > 50;
    List<Product> findByPriceGreaterThan(Double limit);

    // SELECT * FROM PRODUCTS WHERE PRICE >= 50;
    List<Product> findByPriceGreaterThanEqual(Double limit);
}
