package com.retailweb.pearl;

public class Client {

    private int clientId;
    private String clientName;
    private String clientSurname;
    private int clientTypeId;
   

    public Client(int clientId, String clientName, String clientSurname, int clientTypeId){

        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientTypeId = clientTypeId;
    }

    public int getClientId(){

        return clientId;
    }

    public void setClientId(int clientId){
        this.clientId = clientId;
    }

    public String getClientName(){

        return clientName;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public String getClientSurname(){

        return clientSurname;
    }

    public void setClientSurname(String clientSurname){
        this.clientSurname = clientSurname;
    }

    public int getClientType(){

        return clientTypeId;
    }

    public void setClientType(int clientTypeId){
        this.clientTypeId = clientTypeId;
    }

    
}
