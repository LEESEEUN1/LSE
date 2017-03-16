package com.newlecture.web.servlet;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chart")
//'@'>annotation 주석 종류 실행 중에 뽑아 놓을 수 있는 주석 = metadata
//'//'>사람을 위한 주석 실행을 위해 필요가 없기 때문에 지워져버림
public class Chart extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("image/jpeg");
		// 내가 사용하는 내용은 image인데 jpg로 보내겠다
		// 이제 그림그리기 위해 그림판이 필요
		
		//절대경로 설정하는 방법
		String url = "images/foto/egg.jpg";
		ServletContext context = request.getServletContext();
		String path = context.getRealPath(url);
		
		System.out.println(path);
		
		BufferedImage image = ImageIO.read(new File(path)); 
		
		// 그림판준비
		//BufferedImage image = new BufferedImage(800, 800, BufferedImage.TYPE_3BYTE_BGR);
		
		// 이제 도구준비
		Graphics2D g = image.createGraphics();
		/*g.setColor(Color.white);
		g.fillRect(0, 0, 800, 800);*/

		/*
		 * g.setColor(Color.pink); g.drawLine(0, 0, 200, 200);
		 */
		g.setColor(Color.BLUE);

		g.drawLine(70, 50, 70, 410);
	       g.drawString("인원(명)", 50, 30);
	       g.drawString("▲", 64, 50);
	       g.drawLine(60, 400, 610, 400);
	       g.drawString("▶", 610, 405);
	       g.drawLine(600, 410, 600, 50);      
	       g.drawString("누적상대도수(%)", 550, 30);
	       g.drawString("▲", 594, 50);
	       
	       
	       for(int j=1;j<6;j++){
	          for(int i=70;i<=600;i=i+4)
	             g.drawString("- ", i,400-59*j);
	             
	          g.drawString(j*2+"", 55, 400-59*j);
	          g.drawString(j*20+"", 605, 400-59*j);
	      }


		// 출력준비
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "jpg", os);
		
	}

}
