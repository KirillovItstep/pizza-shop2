package org.itstep.pizza;

import org.itstep.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Optional<Pizza> findById(Long id);
}
