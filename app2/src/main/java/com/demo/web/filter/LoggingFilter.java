package com.demo.web.filter;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(urlPatterns = "/",servletNames = "s1")
public class LoggingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(!request.getParameter("country").equals("china")) {
			System.out.println(" Requesting resource...");
			chain.doFilter(request, response);
		}else {
			HttpServletResponse resp=(HttpServletResponse)response;
			resp.sendError(HttpServletResponse.SC_FORBIDDEN, "You are not alloewd here...");
		}
		
	}

}
