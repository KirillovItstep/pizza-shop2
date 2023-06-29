package org.itstep.client;

import org.itstep.pizza.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
