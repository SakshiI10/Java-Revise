package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class message extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException {
		//String n=req.getParameter("name");
		//PrintWriter out=res.getWriter();
		//out.print("Hello "+n);
		
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int sum=n1+n2;
		PrintWriter out=res.getWriter();
		out.print(n1+" + "+n2+" = "+sum);;
	}
}
