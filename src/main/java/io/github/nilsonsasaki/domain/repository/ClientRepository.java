package io.github.nilsonsasaki.domain.repository;

import io.github.nilsonsasaki.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Object> findByNameLike(String name);

    boolean existsByName(String name);

    @Query("DELETE FROM Client c WHERE c.name = :name ")
    @Modifying
    void deleteByName(@Param(("name")) String name);

    @Query(" SELECT c FROM Client c LEFT JOIN FETCH c.clientOrders WHERE c.id = :id ")
    Client findClientFetchClientOrder(@Param("id") Integer id);

}
