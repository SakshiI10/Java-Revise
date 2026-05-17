// First basic code for reference
package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class message extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		// 1. For diplaying Hello
		//String n=req.getParameter("name");
		//PrintWriter out=res.getWriter();
		//out.print("Hello "+n);
		
		// 2. For displaying addition of 2 numbers
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int sum=n1+n2;
		
		// 3. To call another servlet by a servlet using forward [It needs post and doPost]
		//RequestDispatcher rd=req.getRequestDispatcher("add");
		//rd.forward(req, res);
		
		// 4. To call another servlet by a servlet using Sendredirect [It needs Get and service]
		res.sendRedirect("add?x="+sum);
	}
}
