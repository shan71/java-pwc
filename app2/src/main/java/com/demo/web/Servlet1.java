package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/demo",initParams = {@WebInitParam(name = "msg",value ="This is a multi Servlet Application.. ")})

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String message=getServletConfig().getInitParameter("msg");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1><u>"+message+"</u></h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name=request.getParameter("name");
		String loc=request.getParameter("location");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+name+" is from "+loc+"</h1>");
		
		if(loc.equalsIgnoreCase("hyderabad")) {
			//send the control to hyd servlet
			request.getRequestDispatcher("/hyd").forward(request, response);
		}else if(loc.equalsIgnoreCase("bangalore")) {
			request.getRequestDispatcher("/blr").forward(request, response);
			
		}else {
			
			request.getRequestDispatcher("/noLoc").include(request, response);
		}
		
		
	}

}
