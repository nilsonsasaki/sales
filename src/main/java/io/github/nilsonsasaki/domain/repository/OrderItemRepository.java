package io.github.nilsonsasaki.domain.repository;

import io.github.nilsonsasaki.domain.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
}
