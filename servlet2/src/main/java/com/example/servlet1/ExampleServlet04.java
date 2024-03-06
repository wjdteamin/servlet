package com.example.servlet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿
// 1. WAS에 실행하는 특수한 형식의 자바 클래스
// 2. 실행하는 방식
//		사용자 요청을 웹서버가 접수
//		웹서버가 처리 못할 경우 요청 객체를 WAS로 전달
// 		WAS가 요청 주소에 따라 적절한 서블릿을 실행한다.  -> 웹서버가 404를 보내는게 아니라 WAS가 보내는 것이다.

//	 	3. get : 서버의 정보를 변경하지 않는다 -> 보통 읽기 요청 -> 재실행 가능 
//		요청정보가 주소창에 노출(querystring) -> 즐겨찾기 가능

//	 	post : 서버의 정보를 변경하는 요청  -> 추가, 변경, 삭제 요청 -> 재실행 안됨 
// 		즐겨찾기 안됨 

// get하고 post가 바뀌었을 경우에 생기는 에러 405다. 
@WebServlet("/example04.do")
public class ExampleServlet04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청과 응답객체를 편지라고 합시다.
		// 편지지와 편지봉투가 있겠지....
		// 요청/응답의 내용(편지지)를 body
		// 요청/응답의 부가정보(편지)를 header
		
		// 사용자의 IP주소 
		System.out.println(request.getRemoteAddr());
		// 사용자가 요청한 서버 주소
		System.out.println(request.getRequestURI());
	}
	

}
