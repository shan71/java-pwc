package com.demo.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyExceptionMapper implements ExceptionMapper<WebApplicationException> {

	@Override
	public Response toResponse(WebApplicationException exception) {
		
		return Response.ok(exception.getMessage()).build();
	}

}
