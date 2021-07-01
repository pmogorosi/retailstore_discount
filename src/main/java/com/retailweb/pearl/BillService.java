package com.retailweb.pearl;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

@Service

public class BillService implements IBillService {

    private IProductService productService;
    private IClientService clientService;

    ArrayList<Bill> bills = new ArrayList<>();
    ArrayList<BillNetPayment> netPayments = new ArrayList<>();
    

@Override
public List<Bill> getBills(){



bills.add(new Bill(100,new int[]{201, 206, 200, 204}, 5000));
bills.add(new Bill(101,new int[]{201, 203, 200, 205, 206}, 5001));
bills.add(new Bill(102,new int[]{202, 206, 200, 204}, 5002));
bills.add(new Bill(103,new int[]{203, 206, 201, 204, 200}, 5003));
bills.add(new Bill(104,new int[]{201, 206, 200, 204}, 5004));

return bills;
}

 @Override
public List<BillNetPayment> getBillsNetPay(){

    
    for (int b = 0; b < bills.size(); b++){

        Bill bill = bills.get(b);

    int[] billProducts = bill.getBillProductsIds();
    int client = bill.getBillOwner();

    List<Product> products = productService.getAllProducts();
    List<Client> clients = clientService.getClients();
    
    double total = 0;
    double nettotal = 0;
    double netPay = 0;
    double discount = 0;

    for (int i = 0; i < billProducts.length; i++){
    
        for (int x = 0; x < products.size(); i++){
   
          Product product = products.get(x);
   
          total= total+product.getProductPrice();
   
          if(product.getProductId() == i && product.getProductCategoryId() != 101){
   
              nettotal = nettotal +product.getProductPrice();
   
              for(int s = 0; s < clients.size(); s++){
   
                  Client billClient = clients.get(s);
                  int clientType = billClient.getClientType();
                  
                  if (billClient.getClientId() == client && clientType == 01){
                         discount = nettotal*.3;
                       netPay = nettotal - discount;				
                  }
   
                  else if(billClient.getClientId() == client && clientType == 02){
   
                     discount = nettotal*.1;
                       netPay = nettotal - discount;
   
                  }
                  else if(billClient.getClientId() == client && clientType == 03){
   
                      discount = nettotal*.05;
                       netPay = nettotal - discount;
   
                  }
              }
   
          }
   
          }
        }
        int r =01;
        netPayments.add(new BillNetPayment(r+1, bill.getBillId(), total, discount, netPay));
        System.out.println(netPayments);
       
        
    }

    return netPayments;
   

}

    
}
