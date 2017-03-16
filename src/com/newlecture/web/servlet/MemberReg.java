package com.newlecture.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member-reg")
public class MemberReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("UTF-8");
		//요청해서 왔을때 그것을 서버에서 UTF-8로 읽어라
		//원래는 1BYTE씩 나눠서 읽었던 것을 UTF-8의 설정에 맞게 읽음
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String rpwd=request.getParameter("re-pwd");
		String name=request.getParameter("name");
		String[] hobbies=request.getParameterValues("hobbies");
		String hobby=request.getParameter("hobby");
		
		System.out.println("아이디:"+id);
		System.out.println("비밀번호:"+pwd);
		System.out.println("비밀번호 확인:"+rpwd);
		System.out.println("이름:"+name);
		for(String hobb:hobbies)
			System.out.println("취미:"+hobb);
		System.out.println("취미2:"+hobby);
		
	}
}
