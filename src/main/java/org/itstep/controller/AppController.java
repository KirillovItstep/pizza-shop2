package org.itstep.controller;

import org.itstep.client.Client;
import org.itstep.client.ClientDao;
import org.itstep.client.ClientService;
import org.itstep.order.Order;
import org.itstep.order.OrderService;
import org.itstep.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ApplicationContext context;

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
            Client currClient = context.getBean(Client.class);
            currClient.setId(clientDb.getId());
            //System.out.println(currClient);
            model.addAttribute("pizzas", pizzaService.findAll());
            model.addAttribute("client", context.getBean(Client.class));
            List<Order> orders = orderService.findByClientAndStatus(clientService.findById(currClient.getId()), "n");
            model.addAttribute("orders", orders);
            return "index";
        }
        else return "signin";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("client", new ClientDao());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(ClientDao client, Model model){
        //System.out.println(client);
        model.addAttribute("client", new ClientDao());
        if (client.getPassword().equals(client.getPassword2())){
            Client newClient = new Client();
            newClient.setName(client.getName());
            newClient.setLogin(client.getLogin());
            newClient.setAddress(client.getAddress());
            newClient.setEmail(client.getEmail());
            String prefix = "";
            switch (client.getPrefix()){
                case "0": prefix = "+375"; break;
                case "1": prefix = "+972"; break;
                case "2": prefix = "+198"; break;
                case "3": prefix = "+701"; break;
            }
            newClient.setPhone(prefix + client.getPhone());
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
            newClient.setPassword(encoder.encode(client.getPassword()));
            clientService.save(newClient);
        }
        model.addAttribute("pizzas", pizzaService.findAll());
        model.addAttribute("client", context.getBean(Client.class));
        return "index";
    }

}
