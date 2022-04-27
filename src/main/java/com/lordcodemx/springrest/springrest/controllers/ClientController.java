package com.lordcodemx.springrest.springrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(HttpStatus.CREATED)
@RestController
public class ClientController {

    //Handlers
    //-----------------------------------------------------------------------
    @RequestMapping("/salutation")
    public ResponseEntity<String> salutation(){
        String salutation=" Hello World";

        //Study more about ResponseEntity
        return new ResponseEntity<String>(salutation, HttpStatus.ACCEPTED);

        //Short way
        //return ResponseEntity.ok().build();

    }//salutationMethod

    //Handler with parameter
    //-----------------------------------------------------------------------
    @RequestMapping("/salutation/{name}")
    public ResponseEntity<String> salutationWithNamePathParameter(
            @PathVariable String name){
        String response="Hello "+name;

        //Validations
        if(name.length()<2){
            response="Invalid name";
            return new ResponseEntity<String>(response,HttpStatus.BAD_REQUEST);
        }

        //Response after validations
        return new ResponseEntity<String>(response,HttpStatus.OK);
    }//salutationWithNamePathParameter

    /*
    * Activity: Return a Client Object
    * Create a Get Handler
    * It has to return something like this: ResponseEntity<ClientResponse>
    * Use Query param instead of @PathVariable notation
    * QueryParam has to have these parameters: name,lastName, bornDate, clientId
    * This response has to have these attributes:
    *   name :
    *   lastName : String
    *   bornDate (yyyy-mm-dd): String
    *   clientId : long
    * We have to return it with Status Code:200
    *
    * Validations
    * name>3 digits
    * lastname>2 digits
    * clientId>5 digits
    *
    * We have to parser all parameters to the attributes
    * If some of the conditions is not correct, return badRequests
    * */



}//ClientController



