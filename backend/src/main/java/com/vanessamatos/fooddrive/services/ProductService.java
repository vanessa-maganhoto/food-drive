package com.vanessamatos.fooddrive.services;

import com.vanessamatos.fooddrive.dto.ProductDTO;
import com.vanessamatos.fooddrive.entities.Product;
import com.vanessamatos.fooddrive.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> list = productRepository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }
}
