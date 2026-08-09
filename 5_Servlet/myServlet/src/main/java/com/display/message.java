// First basic code for reference
package com.display;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class message extends HttpServlet{
//  Using doPost
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		For diplaying Hello
//		String n=req.getParameter("name");
//		PrintWriter out=res.getWriter();
//		out.print("Hello "+n);
//	}

//	Using service (service has doPost and doGet both)
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
// 		2. For displaying addition of 2 numbers
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int sum=n1+n2;
//		PrintWriter out=res.getWriter();
//		out.print(n1 + " + " +  n2 + " = " + sum);
		
// 		3. To call another servlet by a servlet using forward [It needs post and doPost]
		RequestDispatcher rd=req.getRequestDispatcher("add");
		
// 		When forward is used the flow is client(req) -> s1(req) -> s2(res) -> client
//		rd.forward(req, res);
		
// 		When include is used the flow is client(req) -> s1(req) -> s2(res) -> s1(res) -> client
//		rd.include(req, res);
		
//		4. To call another servlet by a servlet using Sendredirect and the flow is client(req) -> s1(req) -> s1(res) -> s1(req) -> s2(res) -> client
//		res.sendRedirect("add");
		res.sendRedirect("add?x="+sum);
	}
}
