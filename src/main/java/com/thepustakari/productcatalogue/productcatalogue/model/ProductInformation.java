package com.thepustakari.productcatalogue.productcatalogue.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="productInfoTable")
@Table(name="productInfoTable")
public class ProductInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productBarCode;
}
