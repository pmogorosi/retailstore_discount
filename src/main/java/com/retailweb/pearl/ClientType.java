package com.retailweb.pearl;

public class ClientType {

    private int typeId;
    private String typeName;
    private String typeCode;


    public ClientType(int typeId, String typeName, String typeCode){

        this.typeId = typeId;
        this.typeName = typeName;
        this.typeCode = typeCode;


    }

    public int getTypeId(){

        return typeId;
    }

    public void setTypeId(int typeId){
        this.typeId = typeId;
    }

    public String getTypeName(){

        return typeName;
    }

    public void setTypeName(String typeName){
        this.typeName = typeName;
    }

    public String getTypeCode(){

        return typeCode;
    }

    public void setTypeCode(String typeCode){
        this.typeCode = typeCode;
    }
    
}
