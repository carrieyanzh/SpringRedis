package com.example.demo;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Cacheable(value = "products", key = "#id")
    public Product getProductById(Long id) {
        simulateSlowService();
        System.out.println("Fetched from DB: " + id);
        return new Product(id, "Product-" + id, 99.99);
    }

    @CachePut(value = "products", key = "#product.id")
    public Product updateProduct(Product product) {
        System.out.println("Updated: " + product.getId());
        return product;
    }

    @CacheEvict(value = "products", key = "#id")
    public void deleteProduct(Long id) {
        System.out.println("Deleted: " + id);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}