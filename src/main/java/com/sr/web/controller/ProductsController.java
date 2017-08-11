package com.sr.web.controller;

import com.sr.batis.model.Products;
import com.sr.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    @RequestMapping("/get/{pid}")
    public String queryProductsById(@PathVariable Integer pid, Model model){
        System.out.print("接受查询请求，查询id为["+pid+"]的产品");
        Products product = productsService.getProductsById(pid);
        System.out.print(product.getName());
        model.addAttribute("name",product.getName());
        return "products";
    }


    public ProductsService getProductsService() {
        return productsService;
    }
    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }
}