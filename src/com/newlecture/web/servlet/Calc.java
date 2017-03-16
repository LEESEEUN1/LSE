package com.newlecture.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String _x=request.getParameter("x");
		String _y=request.getParameter("y");
		
		//x와y가 필수 입력 값이라면
		//int x=Integer.parseInt(_x);
		//int y=Integer.parseInt(_y);
		
		//x y가 필수가 아닌 옵션 값이라면 > 기본값을 넣어줘야 함(값을 넣지 않을 수도 있기 때문에)
		int x = 0;
		int y = 0;
		
		//x가 전달된 것이 있다면
		if(_x!=null&&!_x.equals(""))
			x=Integer.parseInt(_x);
		
		if(_y!=null&&!_y.equals(""))
			y=Integer.parseInt(_y);
	
		
		//쿼리 스트링이 전달되는 방식 3가지
		//calc			>x=null
		//calc?x=&y=	>x=""
		//calc?x=1&y=2	>
		
		
		PrintWriter out=response.getWriter();

		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("   <form action=\"calc\" method=\"get\">");
		out.write("      <p>");
		out.write("         <label>x:</label>");
		out.write("         <input id=\"txt-x\"  name=\"x\"/>"); 
		out.write("         <label>y:</label>");
		out.write("         <input id=\"txt-y\" name=\"y\"/>");
		out.write("      </p>");
		out.write("      <p>");
		out.write("         sum = <input id=\"txt-sum\" value=\"");
		out.println(x+y);
		out.write("\"/>");
		out.write("      </p>");
		out.write("      <p>");
		out.write("         <input id=\"btn-sum\" type=\"submit\" value=\"Sum\" />");
		out.write("      </p>");
		out.write("   </form>");
		out.write("</body>");
		out.write("</html>");
		
		//내가 html을 출력해줘야 하는 일이 많음
		//사용자에게 결과값 뿐만 아니라 그 형태까지 같이 줘야하기 때문에
		//근데 이렇게 일일히 하면 불편하게 됨 >출력에 대한 해결이 필요>이것이 바로 제스퍼
		//action = add.jsp
		
		
	}

}
