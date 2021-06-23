package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping(path="/test",method = RequestMethod.GET)
	public String getPage() {
		System.out.println("inside Controller...");
		
		return "register";
	}
	
	@RequestMapping(path="/info",method = RequestMethod.GET)
	@ResponseBody
	public String info() {
		return "This is a Spring REST Service";
	}

}
