package com.example.servlet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 
// 서버에서 실행되는 자바 클래스 
// 	1. @WebServlet("주소")
// 2. doGet()
// 3. doPost()

// @WebServlet을 가지고 주소를 찾는 것이다. -> 어노테이션을 가지고 찾는 것이다.  
// 주소는 /로 시작한다.
@WebServlet("/example01")
public class ExampleServlet01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("외부 요청 : " + request.getRequestURI());
	}

}
