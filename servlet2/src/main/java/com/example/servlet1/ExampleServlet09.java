package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// jsp : 

// M : Model - 데이터 
// V : View - 데이터를 출력하는 화면(현재는 jsp)
// C : Contrlloer - 사용자 요청을 접수하고(URl) 적당한 뷰와 연결 
// -> 기능(로그인을 하지 않은 경우 글쓰기를 하지 못하게 하고 로그인창으로 이동)
// == model2

// 주소 제공 
// 같은 작업이면 request를 공유한다. 
@WebServlet("/example9")
public class ExampleServlet09 extends HttpServlet {

	// 주소창이 바뀌는 것은 새로운 작업을 한다는 의미다.
	// 입력화면을 보여준다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// forward : jsp 화면을 보여준다.
		// 주소는 그대로 -> 같은 작업
		RequestDispatcher rd = request.getRequestDispatcher("input9.jsp");
		rd.forward(request, response);
	}

	// 처리 결과를 보여주거나... (다른 곳으로 이동)
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long val1 = Long.parseLong(request.getParameter("val1"));
		Long val2 = Long.parseLong(request.getParameter("val2"));
		Long result = val1 * val2;

		//값을 전달해준다. 결과를 같이 보내주는 것이다.  
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("result9.jsp");
		// 보여주는 것 
		rd.forward(request, response);

	}

}

// forward : 주소가 바뀌지 않는다. 
//				기존 작업을 계속
// 				get 

// redirect  : 주소가 바뀐다. 
//					새로운 작업을 시작한다.
//					post 
