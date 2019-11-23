package com.dev.ibuy.repository;

import com.dev.ibuy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "/by_description")
    List<Product> findByDescriptionContains(@Param("mc") String description);

    @RestResource(path = "/by_description_page")
    Page<Product> findByDescriptionContains(@Param("mc") String description, Pageable pageable);

}
