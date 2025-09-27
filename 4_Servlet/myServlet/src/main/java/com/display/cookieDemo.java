package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class cookieDemo extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException { 
		String s1=req.getParameter("name");
		PrintWriter out=res.getWriter();
		boolean userVisit=false;
		// Array to store cookies
		Cookie[] cookies=req.getCookies();
		
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie c1=cookies[i];
				String name=c1.getName();
				String token=c1.getValue();
				if(name.equals("x") && token.equals("123")) {
					out.print("Welcome back "+s1);
					userVisit=true;
					break;
				}
			}
		}
		if(userVisit==false) {
			Cookie c2=new Cookie("x", "123");
			res.addCookie(c2);
			out.print("Welcome "+s1);
		}
	}

}