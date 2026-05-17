package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws IOException {
		// 3. To call another servlet by a servlet using forward [refer message.java] 
		//PrintWriter out=res.getWriter();
		//out.print("Second Servlet");
		
		// 4. To call another servlet by a servlet using Sendredirect [refer message.java]
		//System.out.println("Second Servlet");
		int num=Integer.parseInt(req.getParameter("x"));
		int sq=num*num;
		PrintWriter out=res.getWriter();
		out.print("Square = "+sq);
	}
}
