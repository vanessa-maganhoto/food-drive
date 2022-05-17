package com.vanessamatos.fooddrive.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vanessamatos.fooddrive.entities.Product;

import java.io.Serializable;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double price;
    private String imageUri;
    private String description;

    public ProductDTO(){}

    public ProductDTO(Long id, String name, Double price, String imageUri, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUri = imageUri;
        this.description = description;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        imageUri = product.getImageUri();
        description = product.getDescription();
    }
}
