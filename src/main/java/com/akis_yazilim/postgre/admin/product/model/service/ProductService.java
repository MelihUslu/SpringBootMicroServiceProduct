package com.akis_yazilim.oracle.melih.product.model.service;

import com.akis_yazilim.oracle.melih.product.model.entity.Product;
import com.akis_yazilim.oracle.melih.product.utility.ExceptionMessageType;
import com.akis_yazilim.oracle.melih.product.utility.Util;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService extends AbstractProductService
{
    @Override
    public Product findById(Integer id)
    {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue()));

        return product;

    }

    @Override
    public List<Product> findAll()
    {

        return productRepository.findAll();
    }

    @Override
    public Product save(Product entity)
    {
       try
       {
           entity.setCreated(new Date());
           return productRepository.save(entity);
       }
       catch (IllegalArgumentException e)
       {
           Util.showExceptionMessage(e);
           return null;
       }

    }

    @Override
    public void deleteByID(Integer id)
    {
        try
        {
            productRepository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
        }

    }

    @Override
    protected List<Product> findByPriceGreaterThan(Double limit)
    {
        return productRepository.findByPriceGreaterThan(limit);
    }

    @Override
    protected List<Product> findByPriceGreaterThanEqual(Double limit)
    {
        return productRepository.findByPriceGreaterThanEqual(limit);
    }
}
