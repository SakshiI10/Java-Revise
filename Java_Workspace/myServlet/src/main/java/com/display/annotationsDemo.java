package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/annotationsDemo")
public class annotationsDemo extends HttpServlet{
		public void service(HttpServletRequest req, HttpServletResponse res) 
				throws IOException, ServletException {
			int n1=Integer.parseInt(req.getParameter("num1"));
			HttpSession session=req.getSession();
			session.setAttribute("x", n1);
			
			// Inspite of using doGet still the value won't be visible in the url as "The value is visible in the URL only when it is sent as a query parameter"
			res.sendRedirect("annotationsDemo2");
		}
}