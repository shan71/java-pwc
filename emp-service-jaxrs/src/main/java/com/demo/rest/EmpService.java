package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.rest.entity.Emp;

@Path("app")
public class EmpService {

	@Path("find/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Emp findEmpById(@PathParam("id") int id) {
		return new Emp(id, "Some One", "Some Location", 100000);
	}
}
