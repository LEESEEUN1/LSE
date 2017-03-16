package com.newlecture.web.servlet;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.dao.mysql.MySQLMemberDao;
import com.newlecture.web.data.dao.MemberDao;
import com.newlecture.web.data.entity.Member;

@WebServlet("/memberlist")
public class MemberList extends HttpServlet
{
   public void service(HttpServletRequest request, HttpServletResponse response) 
		   throws IOException, ServletException 
      // �Ű������� �츮�� ������ �ߴ� �ܼ� ����°� ����Ѱ��̴�. ��ġ System in, System out�ϵ���
   {
	   
	   
	   //----------------����ڿ��� �Է¹޴� �κ�-----------------------------------------
	   	
		String query = request.getParameter("query");
		System.out.println(query);

		//--------���������� ���------------------------------------------

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");/// charset=UTF-8
															/// UTF-8�� �о��
		// �������� ���⼭ ������ ��� ����

		/*
		 * OutputStream os = response.getOutputStream(); PrintStream out = new
		 * PrintStream(os);
		 */

		// Stream�� ���ڿ��� ������ϴµ� Ưȭ������ �ʰ� byte�� �޾ƿ�
		// OutputStream/InputStream : byte
		// Writer/Reader : char
		// utf�� ��� 1byte, 2byte, 3-4byte�� �޾Ƶ鿩�� �� ��찡 ����
		// ���ڿ� ���� stream ���� �ַ� writer�̿�(���ڿ� ����ҋ�)
		PrintWriter out = response.getWriter();

		MemberDao memberDao = new MySQLMemberDao();
		List<Member> list = memberDao.getList("");

		for (Member m : list)
			out.printf("���̵�� '%s' ��й�ȣ�� <span style='color:red'>'%s'</span>\n</br>", m.getId(), m.getPwd());

   }
 
}