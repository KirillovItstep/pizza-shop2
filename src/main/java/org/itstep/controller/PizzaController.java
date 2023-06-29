package org.itstep.controller;

import org.itstep.pizza.Pizza;
import org.itstep.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/index")
    public String getPizzas(Model model) {
        return "index";
    }

}

