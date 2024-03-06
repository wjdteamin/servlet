<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP는 원래 html과 자바를 함께 사용하기위해 만들어진 템플릿 
			jsp는 WAS에서 실행되어 html을 생성한다. 
			그냥 폭망 + 사망 
			
			자바 객체를 출력하는 용도 : EL로 jsp로 되살아난다. 
	-->
	서블릿이 보낸값 : ${hello }
</body>
</html>

<!--  src -> webapp에 만들어야 한다.  jsp로 생성해야한다. -->