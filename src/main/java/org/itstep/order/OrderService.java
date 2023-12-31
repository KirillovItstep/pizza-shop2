package org.itstep.order;

import org.itstep.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public List<Order> findByClientAndStatus(Client client, String status){
        return orderRepository.findByClientAndStatus(client, status);
    }
}
