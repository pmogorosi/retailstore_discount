package com.retailweb.pearl;

public class BillNetPayment {
    

    private int netPayId;
    private int billId;
    private double totalAmount;
    private double discount;
    private double netPayAmount;


    public BillNetPayment(int netPayId,int billId,double totalAmount,double discount, double netPayAmount){

        this.netPayId = netPayId;
        this.billId = billId;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.netPayAmount = netPayAmount;


    }

    public int getNetPayId(){

        return netPayId;
    }
    
    public void setNetPayId(int netPayId){
        this.netPayId = netPayId;
    }
    public int getBillId(){

        return billId;
    }
    
    public void setBillId(int billId){
        this.billId = billId;
    }
  
    public double getTotalAmount(){

        return totalAmount;
    }
    
    public void setTotalAmount(int totalAmount){
        this.totalAmount = totalAmount;
    }
    public double getDiscount(){

        return discount;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    public double getNetPayAmount(){

        return netPayAmount;
    }
    
    public void setNetPayAmount(int netPayAmount){
        this.netPayAmount = netPayAmount;
    }

}
