package com.vanessamatos.fooddrive.services;

import com.vanessamatos.fooddrive.dto.OrderDTO;
import com.vanessamatos.fooddrive.dto.ProductDTO;
import com.vanessamatos.fooddrive.entities.Order;
import com.vanessamatos.fooddrive.entities.OrderStatus;
import com.vanessamatos.fooddrive.entities.Product;
import com.vanessamatos.fooddrive.repositories.OrderRepository;
import com.vanessamatos.fooddrive.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order> list = orderRepository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto){
        Order order = new Order(null, dto.getAddress(), dto.getLatitude(),
                dto.getLongitude(), Instant.now(), OrderStatus.PENDING);

        for (ProductDTO p : dto.getProducts()){
            Product product = productRepository.getById(p.getId());
            order.getProducts().add(product);

        }
        order = orderRepository.save(order);
        return new OrderDTO(order);
    }

    @Transactional
    public OrderDTO setDelivered(Long id){
        Order order = orderRepository.getById(id);
        order.setStatus(OrderStatus.DELIVERED);
        order = orderRepository.save(order);
        return new OrderDTO(order);
    }
}
