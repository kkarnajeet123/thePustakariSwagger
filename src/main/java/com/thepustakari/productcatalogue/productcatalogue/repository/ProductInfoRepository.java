package com.thepustakari.productcatalogue.productcatalogue.repository;

import com.thepustakari.productcatalogue.productcatalogue.model.ProductInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInformation, Long> {
}
