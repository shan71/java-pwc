package com.demo.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class AppllicationConfig extends ResourceConfig{

	public AppllicationConfig() {
		packages("com.demo.rest");
	}
}
