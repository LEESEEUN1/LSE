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
		//��û�ؼ� ������ �װ��� �������� UTF-8�� �о��
		//������ 1BYTE�� ������ �о��� ���� UTF-8�� ������ �°� ����
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String rpwd=request.getParameter("re-pwd");
		String name=request.getParameter("name");
		String[] hobbies=request.getParameterValues("hobbies");
		String hobby=request.getParameter("hobby");
		
		System.out.println("���̵�:"+id);
		System.out.println("��й�ȣ:"+pwd);
		System.out.println("��й�ȣ Ȯ��:"+rpwd);
		System.out.println("�̸�:"+name);
		for(String hobb:hobbies)
			System.out.println("���:"+hobb);
		System.out.println("���2:"+hobby);
		
	}
}
