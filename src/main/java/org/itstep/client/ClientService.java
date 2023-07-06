package org.itstep.client;

import org.itstep.pizza.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findByLogin(String login){
        return clientRepository.findByLogin(login).orElse(null);
    }

    public Client findById(Long id){
        return clientRepository.findById(id).orElse(null);
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }
}
