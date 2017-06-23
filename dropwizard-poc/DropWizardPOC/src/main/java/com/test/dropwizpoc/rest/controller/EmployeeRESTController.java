package com.test.dropwizpoc.rest.controller;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.dropwizpoc.dao.EmployeeDB;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeRESTController {
	
	private final Validator validator;
	 
    public EmployeeRESTController(Validator validator) {
        this.validator = validator;
    }
    
    @GET
    public Response getEmployees() {
    	return Response.ok(EmployeeDB.getEmployees()).build();
    }
}
