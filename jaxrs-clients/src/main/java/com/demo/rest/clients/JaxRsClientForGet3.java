package com.demo.rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.demo.rest.entity.Emp;

public class JaxRsClientForGet3 {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8081/emp-service/rest/");
		
			Emp resp=target.path("emp/find/104")
							.request(MediaType.APPLICATION_JSON)
							.get(Emp.class);
			
			System.out.println(resp);

	}

}
