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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.dao.mysql.MySQLMemberDao;
import com.newlecture.web.data.dao.MemberDao;
import com.newlecture.web.data.entity.Member;

public class Nana extends HttpServlet
{
   public void service(HttpServletRequest request, HttpServletResponse response) 
		   throws IOException, ServletException 
      // 매개변수가 우리가 기존에 했던 콘솔 입출력과 비슷한것이다. 마치 System in, System out하듯이
   {
	   
	   
	   //----------------사용자에게 입력받는 부분-----------------------------------------
	   
	   	response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");///charset=UTF-8 UTF-8로 읽어라
		  //브라우저는 여기서 설정한 대로 읽음
		   
		  
		  OutputStream os = response.getOutputStream();
		  PrintStream out = new PrintStream(os);
		  
		  //Stream은 문자열을 입출력하는데 특화돼있지 않고 byte로 받아옴
		  // OutputStream/InputStream : byte
		  // Writer/Reader : char
		  //utf의 경우 1byte, 2byte, 3-4byte로 받아들여야 할 경우가 있음
		  //문자열 쓸때 stream 말고 주로 writer이용(문자열 출력할떄)
		  PrintWriter out = response.getWriter();
		  
		
		  MemberDao memberDao = new MySQLMemberDao();
		  List<Member> list = memberDao.getList("");
		
		  for(Member m:list)
			   out.printf("아이디는 '%s' 비밀번호는 <span style='color:red'>'%s'</span>\n</br>",m.getId(),m.getPwd());

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //-----------------------출력부분---------------------------------------------

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
		
		/*JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
		encoder.encode(image);*/
		
		
		
		

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
   }

 
}