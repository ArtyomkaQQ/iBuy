package com.dev.ibuy.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Product.class)
public interface ProductProjection {

    double getPrice();
    String getDescription();

}
