package com.thepustakari.productcatalogue.productcatalogue.controller;

import com.thepustakari.productcatalogue.productcatalogue.model.ProductInformation;
import com.thepustakari.productcatalogue.productcatalogue.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productInfo")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/welcome")
    public String welcome(){
        return "This is a welcome page!!";
    }


    @GetMapping("/allProducts")
    public List<ProductInformation> getAllProducts(){
        return productInfoService.getProductList();
    }

    @GetMapping("/product/{id}")
    public ProductInformation getProductById(@PathVariable Long id){
        return productInfoService.getProductById(id);
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductInformation productInformation){
        String response= productInfoService.addProducts(productInformation);
        return response;
    }

    @DeleteMapping("delete/{productId}")
    public String deleteProduct(@PathVariable Long productId){
        String response = productInfoService.deleteProduct(productId);
        return response;

    }
}
