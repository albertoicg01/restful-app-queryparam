package com.lordcodemx.springrest.springrest.domain;
import lombok.Data;
//This notation is for not adding setters and getters
//We needed lombok dependency
@Data
public class ClientResponse {
    private String name;
    private String lastname;
    private String bornDate;
    private long clientId;

    //Constructor method
    public ClientResponse(String name, String lastname,String bornDate,long clientId){
        this.name=name;
        this.lastname=lastname;
        this.bornDate=bornDate;
        this.clientId=clientId;

    }

}
