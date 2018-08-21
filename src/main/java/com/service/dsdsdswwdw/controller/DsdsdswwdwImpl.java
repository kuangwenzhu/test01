package com.service.dsdsdswwdw.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-21T07:47:08.079Z")

@RestSchema(schemaId = "dsdsdswwdw")
@RequestMapping(path = "/dsdsdswwdw", produces = MediaType.APPLICATION_JSON)
public class DsdsdswwdwImpl {

    @Autowired
    private DsdsdswwdwDelegate userDsdsdswwdwDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDsdsdswwdwDelegate.helloworld(name);
    }

}
