package com.thepustakari.productcatalogue.productcatalogue.service;

import com.thepustakari.productcatalogue.productcatalogue.model.ProductInformation;
import com.thepustakari.productcatalogue.productcatalogue.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    public List<ProductInformation> getProductList(){
       // List<ProductInformation> productInformationList = new ArrayList<>();
        return productInfoRepository.findAll();
    }

    public ProductInformation getProductById(Long id){
        return productInfoRepository.findById(id).get();
    }

    public String addProducts(ProductInformation productInformation){
        productInfoRepository.save(productInformation);
        return "Product has been saved!! ";
    }

    public String deleteProduct(Long id){
        productInfoRepository.deleteById(id);
        return "Product with productId = "+id +" has been removed!! ";
    }
}
