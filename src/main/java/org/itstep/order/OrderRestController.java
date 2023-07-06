package org.itstep.order;

import org.itstep.client.Client;
import org.itstep.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.findAll();
    }

    @GetMapping(value="/orders/client/{client}/status/{status}")
    public List<Order> getOrdersClientStatus(
            @PathVariable("client") Long client_id,
            @PathVariable("status") String status){
        return orderService.findByClientAndStatus(clientService.findById(client_id), status);
    }
}

