package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException {
		PrintWriter out=res.getWriter();
		out.print("Second Servlet");
	}
}
