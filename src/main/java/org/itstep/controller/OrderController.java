package org.itstep.controller;

import org.itstep.client.Client;
import org.itstep.client.ClientService;
import org.itstep.order.Order;
import org.itstep.order.OrderDto;
import org.itstep.order.OrderService;
import org.itstep.order_details.OrderDetails;
import org.itstep.order_details.OrderDetailsService;
import org.itstep.pizza.Pizza;
import org.itstep.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private ClientService clientService;

    @Autowired
    private OrderDetailsService orderDetailsService;

    @Autowired
    private OrderService orderService;

    @PostMapping(value="/order")
    public String addOrder(@RequestBody OrderDto orderDto, Model model){
        //System.out.println(orderDto);
        Client client = clientService.findById(orderDto.getClient_id());
        Pizza pizza = pizzaService.findById(orderDto.getPizza_id());

        Order newOrder = new Order();
        newOrder.setClient(client);
        newOrder.setDate(new Date());
        newOrder.setStatus("n");
        Order order = orderService.save(newOrder);

        OrderDetails newOrderDetails = new OrderDetails();
        newOrderDetails.setCount(orderDto.getCount());
        newOrderDetails.setOrder(order);
        newOrderDetails.setPizza(pizza);
        OrderDetails orderDetails = orderDetailsService.save(newOrderDetails);

        // Long id = orderDetailsService.save(new OrderDetails(client_id,pizza_id));
        model.addAttribute("pizzas", pizzaService.findAll());
        model.addAttribute("client", context.getBean(Client.class));
        return "index";
    }


}
