package com.retailweb.pearl;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ClientTypeController {

@Autowired
private IClientTypeService clientTypeService;

@GetMapping(value = "/client_type")
public List<ClientType> getClientType(){

    List<ClientType> clientTypes = clientTypeService.getAllTypes();

    return clientTypes;
}
    
}
