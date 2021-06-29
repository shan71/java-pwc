package com.demo.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.demo.rest.entity.Emp;

@Path("emp")
public class EmpService {

	@Inject
	EmpDao dao= new EmpDaoJpaImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Emp> listAll() {
		List<Emp> empList = dao.listAll();
		return empList;
	}

	@Path("find/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response findEmpById(@PathParam("id") int id, @HeaderParam("Accept") String acceptHeader) {

		System.out.println("Client Accept Header : " + acceptHeader);
		Emp e;
		Response resp = null;
		try {
			e = dao.findById(id);
			return resp = Response.ok(e).cacheControl(CacheControl.valueOf("max-age=3600")).build();
		} catch (EmpNotFoundException e1) {
			throw new WebApplicationException(e1.getMessage());
		}

	}

	@Path("save")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.TEXT_PLAIN)
	public Response savEmp(Emp e) {
		String response = dao.save(e);

		return Response.status(Status.OK).entity(response).build();

	}

	@Path("saveForm")
	@POST
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces(MediaType.TEXT_PLAIN)
	public Response savEmpForm(
			@FormParam("empId") int id, 
			@FormParam("empName") String name, 
			@FormParam("city") String city, 
			@FormParam("salary")double salary) {
		String response = dao.save(new Emp(id, name, city, salary));

		return Response.status(Status.OK).entity(response).build();

	}

	@Path("update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response updateEmp(Emp e) {
		String response = "";
		try {
			response = dao.update(e);
		} catch (EmpNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return Response.ok(response).build();

	}

	@Path("delete")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public Response deleteEmp(@QueryParam("id") int id) {
		String response;
		try {
			response = dao.delete(id);
		} catch (EmpNotFoundException e) {
			throw new WebApplicationException(e.getMessage());
		}
		return Response.ok(response).build();

	}

}
