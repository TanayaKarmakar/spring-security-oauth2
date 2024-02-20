package com.app.oauth2.repository;

import com.app.oauth2.common.IdGenerator;
import com.app.oauth2.models.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class ProductRepository {
    private Map<Long, Product> productMap = new HashMap<>();

    public Product addProduct(Product product) {
        Long id = IdGenerator.getNextId();
        product.setId(id);
        productMap.put(id, product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productMap.values().stream().toList();
    }
}
