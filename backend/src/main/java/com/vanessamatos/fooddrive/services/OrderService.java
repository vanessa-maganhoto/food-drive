package com.vanessamatos.fooddrive.services;

import com.vanessamatos.fooddrive.dto.OrderDTO;
import com.vanessamatos.fooddrive.dto.ProductDTO;
import com.vanessamatos.fooddrive.entities.Order;
import com.vanessamatos.fooddrive.entities.Product;
import com.vanessamatos.fooddrive.repositories.OrderRepository;
import com.vanessamatos.fooddrive.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order> list = orderRepository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }
}
