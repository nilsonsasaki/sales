package io.github.nilsonsasaki.domain.repository;

import io.github.nilsonsasaki.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
