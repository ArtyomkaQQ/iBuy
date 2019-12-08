package com.dev.ibuy;

import com.dev.ibuy.model.Product;
import com.dev.ibuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IbuyApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(IbuyApplication.class, args);
	}


	@Override
	public void run(String... args) {
		productRepository.save(new Product(1L, "Lenovo laptop", 1200, 10));
		productRepository.save(new Product(2L, "HP laptop", 1300, 10));
		productRepository.save(new Product(3L, "Lenovo laptop", 1200, 10));
		productRepository.save(new Product(4L, "HP laptop", 1300, 10));
		productRepository.save(new Product(5L, "Lenovo laptop", 1200, 10));
		productRepository.save(new Product(6L, "HP laptop", 1300, 10));

		productRepository.findAll().forEach(p -> System.out.println(p.toString()));
	}

}
