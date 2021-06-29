package com.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.demo.rest.entity.Emp;

@Path("emp")
public class EmpService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Emp> listAll() {
		List<Emp> empList = new ArrayList<>();
		return empList;
	}

	@Path("find/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response findEmpById(@PathParam("id") int id) {
		return Response.ok(new Emp(id, "Some One", "Some Location", 100000)).build();
	}

	@Path("save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response savEmp(Emp e) {
		System.out.println("EMP saved ");
		return Response.status(Status.OK).entity(e.getName()).build();

	}

	@Path("update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateEmp(Emp e) {
		System.out.println("EMP updated ");
		return e.getName();

	}

	@Path("delete")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmp(@QueryParam("id") int id) {
		System.out.println("EMP deleted ");
		return "delete emp with id " + id;

	}

}
