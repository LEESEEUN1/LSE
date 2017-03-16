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
      // �Ű������� �츮�� ������ �ߴ� �ܼ� ����°� ����Ѱ��̴�. ��ġ System in, System out�ϵ���
   {
	   
	   
	   //----------------����ڿ��� �Է¹޴� �κ�-----------------------------------------
	   
	   	response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");///charset=UTF-8 UTF-8�� �о��
		  //�������� ���⼭ ������ ��� ����
		   
		  
		  OutputStream os = response.getOutputStream();
		  PrintStream out = new PrintStream(os);
		  
		  //Stream�� ���ڿ��� ������ϴµ� Ưȭ������ �ʰ� byte�� �޾ƿ�
		  // OutputStream/InputStream : byte
		  // Writer/Reader : char
		  //utf�� ��� 1byte, 2byte, 3-4byte�� �޾Ƶ鿩�� �� ��찡 ����
		  //���ڿ� ���� stream ���� �ַ� writer�̿�(���ڿ� ����ҋ�)
		  PrintWriter out = response.getWriter();
		  
		
		  MemberDao memberDao = new MySQLMemberDao();
		  List<Member> list = memberDao.getList("");
		
		  for(Member m:list)
			   out.printf("���̵�� '%s' ��й�ȣ�� <span style='color:red'>'%s'</span>\n</br>",m.getId(),m.getPwd());

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //-----------------------��ºκ�---------------------------------------------

		response.setContentType("image/jpeg");
		// ���� ����ϴ� ������ image�ε� jpg�� �����ڴ�
		// ���� �׸��׸��� ���� �׸����� �ʿ�
		
		//������ �����ϴ� ���
		String url = "images/foto/egg.jpg";
		ServletContext context = request.getServletContext();
		String path = context.getRealPath(url);
		
		System.out.println(path);
		
		BufferedImage image = ImageIO.read(new File(path)); 
		
		// �׸����غ�
		//BufferedImage image = new BufferedImage(800, 800, BufferedImage.TYPE_3BYTE_BGR);
		
		// ���� �����غ�
		Graphics2D g = image.createGraphics();
		/*g.setColor(Color.white);
		g.fillRect(0, 0, 800, 800);*/

		/*
		 * g.setColor(Color.pink); g.drawLine(0, 0, 200, 200);
		 */
		g.setColor(Color.BLUE);

		g.drawLine(70, 50, 70, 410);
	       g.drawString("�ο�(��)", 50, 30);
	       g.drawString("��", 64, 50);
	       g.drawLine(60, 400, 610, 400);
	       g.drawString("��", 610, 405);
	       g.drawLine(600, 410, 600, 50);      
	       g.drawString("������뵵��(%)", 550, 30);
	       g.drawString("��", 594, 50);
	       
	       
	       for(int j=1;j<6;j++){
	          for(int i=70;i<=600;i=i+4)
	             g.drawString("- ", i,400-59*j);
	             
	          g.drawString(j*2+"", 55, 400-59*j);
	          g.drawString(j*20+"", 605, 400-59*j);
	      }


		// ����غ�
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "jpg", os);
		
		/*JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
		encoder.encode(image);*/
		
		
		
		

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
   }

 
}