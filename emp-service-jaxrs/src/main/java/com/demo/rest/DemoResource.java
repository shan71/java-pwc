package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("demo")
public class DemoResource {

	@Path("greet/{userName}")						//GET http://localhost:8080/emp-service-jaxrs/demo/greet
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet(@PathParam("userName") String name) {
		return name+", Hello from JAX RS Jersey";
	}
	
	//GET http://localhost:8080/emp-service-jaxrs/demo/add?x=20&y=30
		
	@Path("add")
	@GET
	@Produces("application/json")
	public String add(@QueryParam("x") int a, @QueryParam("y") int b) {
		return "{\"The Sum\":"+(a+b)+"}";
	}
}
