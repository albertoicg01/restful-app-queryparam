package com.lordcodemx.springrest.springrest.domain;

public class ClientResponse {
    private String name;
    private String lastname;

    //Constructor method
    public ClientResponse(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    //Getters
    //----------------------------------------------------------------------------
    public String getName() {
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    //Setters
    //----------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
