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
      // 매개변수가 우리가 기존에 했던 콘솔 입출력과 비슷한것이다. 마치 System in, System out하듯이
   {
	   
	   
	   //----------------사용자에게 입력받는 부분-----------------------------------------
	   	
		String query = request.getParameter("query");
		System.out.println(query);

		//--------웹페이지에 출력------------------------------------------

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");/// charset=UTF-8
															/// UTF-8로 읽어라
		// 브라우저는 여기서 설정한 대로 읽음

		/*
		 * OutputStream os = response.getOutputStream(); PrintStream out = new
		 * PrintStream(os);
		 */

		// Stream은 문자열을 입출력하는데 특화돼있지 않고 byte로 받아옴
		// OutputStream/InputStream : byte
		// Writer/Reader : char
		// utf의 경우 1byte, 2byte, 3-4byte로 받아들여야 할 경우가 있음
		// 문자열 쓸때 stream 말고 주로 writer이용(문자열 출력할떄)
		PrintWriter out = response.getWriter();

		MemberDao memberDao = new MySQLMemberDao();
		List<Member> list = memberDao.getList("");

		for (Member m : list)
			out.printf("아이디는 '%s' 비밀번호는 <span style='color:red'>'%s'</span>\n</br>", m.getId(), m.getPwd());

   }
 
}