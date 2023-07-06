package org.itstep.order_details;

import org.itstep.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderDetailsRestController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/orders_details")
    public List<OrderDetails> getOrders() {
        return orderDetailsService.findAll();
    }

}

