package org.itstep.controller;

import org.itstep.client.Client;
import org.itstep.client.ClientDao;
import org.itstep.client.ClientService;
import org.itstep.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("client", new Client());
        return "signin";
    }

    @PostMapping("/signin")
    public String signin(Client client, Model model) {
        model.addAttribute("client", new Client());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        Client clientDb = clientService.findByLogin(client.getLogin()); //Есть ли пользователь в бд
        if (clientDb==null) return "signin";
        if (encoder.matches(client.getPassword(), clientDb.getPassword())){
            model.addAttribute("pizzas", pizzaService.findAll());
            return "index";
        }
        else return "signin";
    }
}
