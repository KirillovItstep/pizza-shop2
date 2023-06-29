package org.itstep.client;

import org.itstep.pizza.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.findAll();
    }

}

