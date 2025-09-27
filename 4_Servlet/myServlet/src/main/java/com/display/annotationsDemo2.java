package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/annotationsDemo2")
public class annotationsDemo2 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		HttpSession session=req.getSession();
		int num1=(int)session.getAttribute("x");
		int sq=num1*num1;
		
		PrintWriter out=res.getWriter();
		out.print("Square of the number = "+sq);
	}
}
