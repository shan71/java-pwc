package com.demo.rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.demo.rest.entity.Emp;

public class JaxRsClientForPOST {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8081/emp-service/rest/");
		
		Emp emp = new Emp(402, "Prashanth", "Gurgaon", 67000);
		
		String response= target.path("emp/save").request(MediaType.TEXT_PLAIN).post(Entity.entity(emp, MediaType.APPLICATION_JSON),String.class);
		
			System.out.println(response);

	}

}
