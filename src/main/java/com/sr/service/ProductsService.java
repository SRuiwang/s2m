package com.sr.service;

import com.sr.batis.dao.ProductsMapper;
import com.sr.batis.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productsService")
public class ProductsService {


    private ProductsMapper productsMapper;

    public ProductsMapper getProductsMapper() {
        return productsMapper;
    }

    @Autowired
    public void setProductsMapper(ProductsMapper productsMapper) {
        this.productsMapper = productsMapper;
    }

    public Products getProductsById(Integer pId){
        return productsMapper.selectByPrimaryKey(pId);
    }
}