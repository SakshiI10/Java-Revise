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
			res.sendRedirect("annotationsDemo2");
		}
}
