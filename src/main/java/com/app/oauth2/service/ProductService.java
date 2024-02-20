package com.app.oauth2.service;

import com.app.oauth2.models.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product> getAllProducts();
}
