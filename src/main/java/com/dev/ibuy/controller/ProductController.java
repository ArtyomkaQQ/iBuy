package com.dev.ibuy.controller;

import com.dev.ibuy.entity.Product;
import com.dev.ibuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/list_products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable(name = "id") Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "/{id}")
    public Product updateProduct(@PathVariable(name = "id") Long id, @RequestBody Product product) {
        product.setId(id);

        return productRepository.save(product);
    }

    @PostMapping(value = "/{id}")
    public Product saveProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable(name = "id") Long id) {
        productRepository.deleteById(id);
    }

}
