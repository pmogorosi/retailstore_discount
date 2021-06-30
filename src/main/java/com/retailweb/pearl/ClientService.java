package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService{

@Override
public List<Client> getClients(){

ArrayList<Client> clients = new ArrayList<Client>();

clients.add(new Client(5000, "Grace", "Holy", 01));
clients.add(new Client(5001, "Kealeboga", "Kealeboga", 02));
clients.add(new Client(5002, "Pearl", "Mogorosi", 03));
clients.add(new Client(5003, "Neo", "Neyo", 03));
clients.add(new Client(5004, "Donald", "Dawg", 03));

return clients;
}
    
}
