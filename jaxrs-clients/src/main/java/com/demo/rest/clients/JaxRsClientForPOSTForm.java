package com.demo.rest.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import com.demo.rest.entity.Emp;

public class JaxRsClientForPOSTForm {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8081/emp-service/rest/");
		Form form=new Form();
		form.param("empId", "403");
		form.param("empName", "Shanti");
		form.param("city", "Bangalore");
		form.param("salary", "56000");
		
		String response= target.path("emp/saveForm")
								.request(MediaType.TEXT_PLAIN)
								.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED),String.class);
		
			System.out.println(response);

	}

}
