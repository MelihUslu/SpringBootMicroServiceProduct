package com.akis_yazilim.postgre.admin.product.model.service;

import com.akis_yazilim.postgre.admin.product.model.entity.Product;
import com.akis_yazilim.postgre.admin.product.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractProductService implements EntityService<Product, Integer>
{
    @Autowired
    protected ProductRepository productRepository;

    protected abstract List<Product> findByPriceGreaterThan(Double limit);

    protected abstract List<Product> findByPriceGreaterThanEqual(Double limit);

}
