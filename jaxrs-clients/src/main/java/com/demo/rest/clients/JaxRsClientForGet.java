package com.demo.rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JaxRsClientForGet {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8081/emp-service/rest/");
		
			String resp=target.path("emp/find/104")
							.request(MediaType.APPLICATION_XML)
							.get(String.class);
			
			System.out.println(resp);

	}

}
