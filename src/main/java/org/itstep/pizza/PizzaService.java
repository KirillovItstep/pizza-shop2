package org.itstep.pizza;

import org.itstep.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }

    public Pizza findById(Long id){
        return pizzaRepository.findById(id).orElse(null);
    }
}
