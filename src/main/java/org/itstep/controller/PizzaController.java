package org.itstep.controller;

import org.itstep.client.Client;
import org.itstep.pizza.Pizza;
import org.itstep.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private ApplicationContext context;

    @GetMapping("/index")
    public String getPizzas(Model model) {
        model.addAttribute("pizzas", pizzaService.findAll());
        //Client currClient = context.getBean(Client.class);
        //System.out.println(currClient);
        model.addAttribute("client", context.getBean(Client.class));
        return "index";
    }

}

