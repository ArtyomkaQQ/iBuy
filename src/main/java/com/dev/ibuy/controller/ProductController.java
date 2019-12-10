package com.dev.ibuy.controller;

import com.dev.ibuy.model.Product;
import com.dev.ibuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/list_products")
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/list_products/{id}")
    public Product listProducts(@PathVariable(name = "id") Long id) {
        return productRepository.findById(id).get();
    }

    @PutMapping(value = "/list_products/{id}")
    public Product update(@PathVariable(name = "id") Long id, @RequestBody Product product) {
        product.setId(id);

        return productRepository.save(product);
    }

    @PostMapping(value = "/list_products/{id}")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping(value = "/list_products/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        productRepository.deleteById(id);
    }

}
