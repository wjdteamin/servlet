package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example6")
public class ExampleServlet06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String hello = "안녕하세요";

		// 이 문자열을 jsp에 넘겨주자
		// 어떻게 넘겨주느냐 : request에 담아서 다음 작업할 곳으로 넘기자 
		
		// olc center에 가서 공부하기 model2를 확인하면 된다 .
		
		// 웹은 사용자의 요청을 처리하기위해 request가 떠나서 여행을 간다. 
		// request가 요청 결과를 담아서 다음 결과를 담고 끝으로 jsp에 넘겨주고 죽는다. 
		// 한번에 다 작업을 하는게 아니라 하나씩 결과를 담고, 다 끝나면 jsp로 넘겨준다. -> 완전하게 결과가 나오면 request는 죽는다.  
		
		// 담는것
		request.setAttribute("hello", hello);
		
		// jsp에 넘기자
		// request에 있으니까. 
		RequestDispatcher rd = request.getRequestDispatcher("example6.jsp");
		
		// foward!!!!!!!!!!!!
		// 서블릿에서 jsp로 이동 : 주소는 바뀌지 않는다. 
		// 
		rd.forward(request, response);
	}

}
