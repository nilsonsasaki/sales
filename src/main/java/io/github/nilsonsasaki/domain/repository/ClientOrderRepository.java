package io.github.nilsonsasaki.domain.repository;

import io.github.nilsonsasaki.domain.entity.Client;
import io.github.nilsonsasaki.domain.entity.ClientOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientOrderRepository extends JpaRepository<ClientOrder, Integer> {

    List<ClientOrder> findByClient(Client client);
}
