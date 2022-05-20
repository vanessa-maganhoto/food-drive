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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
