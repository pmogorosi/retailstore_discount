package com.retailweb.pearl;

//import org.springframework.stereotype.Component;


public class Bill {

    private int billId;
    private int[] billProductsIds = new int[1000000];
    private int clientId;
  
   


  public Bill (int billId, int[] billProductsIds, int clientId) 
  {
      this.billId = billId;
      this.billProductsIds = billProductsIds;
      this.clientId = clientId;
     
     
  }

  public Bill(){}

  

  public int getBillId(){

    return billId;
}

public void setBillId(int billId){
    this.billId = billId;
}
public int[] getBillProductsIds(){

    return billProductsIds;
}

public void setBillProducts(int[] billProductsIds){
    this.billProductsIds = billProductsIds;
}

public int getBillOwner(){

    return clientId;
}

public void setBillOwner(int clientId){
    this.clientId = clientId;
}





}
