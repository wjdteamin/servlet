package com.example.servlet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example02_1")
public class ExampleServlet02_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String irum = request.getParameter("irum");
		String nai =	request.getParameter("nai");
		
		System.out.println(irum);
		System.out.println(nai);
		System.out.println(nai + " " + irum);
	}
	
}
