package com.service.kwz001.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-21T02:18:01.488Z")

@RestSchema(schemaId = "kwz001")
@RequestMapping(path = "/kwz001", produces = MediaType.APPLICATION_JSON)
public class Kwz001Impl {

    @Autowired
    private Kwz001Delegate userKwz001Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userKwz001Delegate.helloworld(name);
    }

}
