package com.retailweb.pearl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class PearlApplication {

	@Autowired
	private BillService billservice;

	private IProductService productService;


	

	// private IClientService clientService;


	public  List<Bill> allBills = billservice.getBills();
	double netPayment;

	public static void main(String[] args) {
		SpringApplication.run(PearlApplication.class, args);

	}

	public PearlApplication(){}

	// public void getBill(){

	// 	for(int i = 0; i < allBills.size(); i++ ){

	// 		Bill bill = allBills.get(i);
	// 		// getNetPayableAmount(bill);
	// 	}
	// }
	

	// public double getNetPayableAmount(Bill bill) {

    //  int[] billProducts = bill.getBillProductsIds();
	//  int client = bill.getBillOwner();

	//  List<Product> products = productService.getAllProducts();
	//  List<Client> clients = clientService.getClients();
	 
	//  double total = 0;
	//  double nettotal = 0;
	//  double netPay = 0;

	//  for (int i = 0; i < billProducts.length; i++){
     
	//   for (int x = 0; x < products.size(); i++){

	// 	Product product = products.get(x);

	// 	total= total+product.getProductPrice();

	// 	if(product.getProductId() == i && product.getProductCategoryId() != 101){

	// 		nettotal = nettotal +product.getProductPrice();

	// 		for(int s = 0; s < clients.size(); s++){

	// 			Client billClient = clients.get(s);
	// 			int clientType = billClient.getClientType();
				
	// 			if (billClient.getClientId() == client && clientType == 01){
	// 					double discount = nettotal*.3;
	// 				 netPay = nettotal - discount;				
	// 			}

	// 			else if(billClient.getClientId() == client && clientType == 02){

	// 				double discount = nettotal*.1;
	// 				 netPay = nettotal - discount;

	// 			}
	// 			else if(billClient.getClientId() == client && clientType == 03){

	// 				double discount = nettotal*.05;
	// 				 netPay = nettotal - discount;

	// 			}
	// 		}

	// 	}

	// 	}
	//   }

	//   return netPay;

	// }


	



}
