package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClientTypeService implements IClientTypeService{

@Override
public List<ClientType> getAllTypes(){

ArrayList<ClientType> clientTypes = new ArrayList<ClientType>();

clientTypes.add(new ClientType(01, "Employee", "T1"));
clientTypes.add(new ClientType(02, "Affiiate", "T2"));
clientTypes.add(new ClientType(03, "Customer", "T3"));

return clientTypes;
}
    
}
