package com.retailweb.pearl;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ClientController {

@Autowired
private IClientService clientService;

@GetMapping(value = "/client")
public List<Client> getClient(){

    List<Client> clients = clientService.getClients();

    return clients;
}

    
}
