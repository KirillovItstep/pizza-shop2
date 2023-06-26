package org.itstep.pizza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}