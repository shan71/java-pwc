package com.demo.rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JaxRsClientForGet2 {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("https://jsonplaceholder.typicode.com/posts/");
		
			String resp=target.path("78")
							.request(MediaType.APPLICATION_JSON)
							.get(String.class);
			
			System.out.println(resp);

	}

}
