package com.sr.service;

import com.sr.batis.model.Products;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-services.xml"})
public class ProductsServiceTest extends TestCase {


    private ProductsService productsService;

    public ProductsService getProductsService() {
        return productsService;
    }
    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @Test
    public void test1() {
        System.out.print("aaa");
    }

    @Test
    public void testMybatis() {
        Products p = productsService.getProductsById(1);
        System.out.print(p.getName());
    }
}