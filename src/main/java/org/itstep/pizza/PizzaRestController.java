package org.itstep.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaRestController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public List<Pizza> getPizzas() {
        return pizzaService.findAll();
    }

}

