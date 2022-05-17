package com.vanessamatos.fooddrive.repositories;

import com.vanessamatos.fooddrive.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
