package com.newlecture.web.data.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.newlecture.web.dao.oracle.OracleMemberDao;
import com.newlecture.web.data.dao.MemberDao;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//Controller=======================================================
		//������� �䱸 �޾Ƽ� �� ���ϴ� ������ ������
		
		/*String sql = "SELECT  * FROM MEMBER WHERE MID LIKE '%a%'";//a�� ���Ե� id�� ����ϴ� ������
      
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    rs.next();
	    //������ �ִ� ���ڵ� �ϳ� �����
	     
	    String mid;
	    String pwd;
	    //mid�� pwd�� ��>���� �� ���´� �������θ� ���� ��	
	    
	    //�������� �����͸� ����ϴ� ����
	    //�������� ������=����� ����=��ü=entity
	    //����ȭ�Ѵ�=�׷����Ѵ�(�����͸� �����ϴ� �̸��� �ٰ� ��)
	    //ex) 
	    //int����,int�г�,String�̸�,int���� > �л�����
	    //String����,int����,int�Ⱓ  > ��������
	    //�̰͵��� ������ ���� ���ǵǴ� ������ �ڷ������� ����->�̰��� �ٷ� ����ȭ
	    //�Ӽ��� �κη�Ʈ���� �ʰ� �츮�� ������ �� �ִ� �������� �����ͷ� �������� ����ȭ
	    //�������� �����͸� ����ϴ� ����
	    //1.
	    //2.
	    //3. 
	    
	    String mid=null;
	    String pwd=null;
	    //���ϰ�� ����, ���ϰ�� �������� ���
	    String gender=null;
	    //mid pwd gender�� �κη��� ������ �̰͵��� ���������� ������ member���� ������, Member �ڷ����� ��.
	    //������� �����͵��� �ð������� ������ �� �װ��� �ٷ�Member �ڷ���
	    
	    
	    //����� �������� �۾�
	    
	    Member member=null;
	    List<Member> list = new ArrayList<>();
	    
	    while(rs.next())
	    {
	    	member=new Member();
		    member.setPwd(rs.getString("PWD"));
		    member.setMid(rs.getString("MID"));
		    //gender = rs.getNString("GENDER");
		    //System.out.printf("���̵�� '%s' ��й�ȣ�� '%s' ������ ����\n",mid,pwd); //���=view��  ������ �ʿ䰡 ����.
		    list.add(member);
	    }//�����͸� �������ִ� �ڵ�
	    
	    rs.close();
	    st.close();
	    con.close();
	    
	    ==>���� �̰��� �߶� �����͸� ������ Ŭ������ ���� ���� jdbc.dao�� �������� �����͸� �������� Ŭ���� ����
	     jdbc.dao>MemberDao
	     	Ŭ������ �и����ѳ������ν� ������ ��������. 
	     	��°� �����͸� �������� �۾�(�����ͼ���)�� �и��Ʊ� ������ (�� Ŭ������ ���� �ʱ� ������) 
	     	���� �۾� ����*/
	    
	    
	    //Model===============================================================
	    //������ ��Ʈ�ѷ�(�����͸� �������� �۾�)�� ��(�����͸� ����ϴ� �۾�)�� ����ȭ �� ����->
	    //������ �������� �Ͱ� ����ϴ� ���� ���̸� ��������
	    //���� ������ ��������
	    //������ �Ұ����� ����
	    //�����͸� �������� �ð��� ������� ����� ���� ��ٷ��� �ϴ� �ð��� �����
	    //����ȭ�� �Ǹ� ���� ��ٷ��� �ϴ� �ð��� ������� ������ �����͸� ��Ƴ��� �� ���� ������ �� �� �ֵ��� ��.
	    
	    //�и��ϱ� ���� ��Ƴ��� �׸��� �ʿ��ϰ� ��=��
	    //����� ������ ����ִ°� =����ϱ� ���� �����͸� ��Ƴ��� ��
	    //b, ���� �и��� ���� �ƴ϶� �����ż� ���Ǵ� ���±� ������ ��Ʈ�ѷ��� �� ���̿� ��������
	    //�̰��� �ٷ� MVC1
	    
	    
	   /* //View================================================================
	    //������ �����͸� ����ϴ� �ڵ�
		 for(Member m:list)
			    System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",m.getMid(),m.getPwd());*/
		
		//System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",member.getMid(),member.getPwd());
	    //mid�� pwd�� ��>���� �� ���´� �������θ� ���� ��
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * ȸ���˻� ���α׷� ����
		 * System.out.println("		[ȸ�� �˻� ���α׷�]");
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �з� ���̵�(1) �̸�(2) ����(3) : ");
		
		String x = scan.next();
		
		System.out.print("�˻��� �Է�  : ");
		
		String y = scan.next();
		
		MemberDao memberDao = new MemberDao();
		List<Member> list = memberDao.getList(x, y);
		
		
		for(Member m:list)
	    	System.out.printf("%-10s %-10s %-10d\n",m.getMid(),m.getName(),m.getAge());
*/
		
		
		
		
		
		
		/*Scanner scan1 = new Scanner(System.in);
		System.out.print("�˻���"+x+"�� �Է��Ͻÿ� : ");*/
		
		
		
		/*
		//Controller==========================================================
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� id�� �Է��Ͻÿ� : ");
		
		String x = scan.next();
		
		MemberDao memberDao = new MemberDao();
		List<Member> list = memberDao.getList(x);
		
		//Model===============================================================
		
		//View================================================================
	    for(Member m:list)
	    	System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",m.getMid(),m.getPwd());

	    */

	    /*while(rs.next())
	    {
		    pwd = rs.getString("PWD");
		    mid = rs.getString("MID");
		    //if(mid.contains("a"))//a�� ���Ե� id�� ����ϴ� ��
		    System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",mid,pwd);
		    
	    }*/

	    /*while(rs.next())
	    {

		    pwd = rs.getString("PWD");
		    mid = rs.getString("MID");
		    System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",mid,pwd);
		    
	    }
	    
	    rs.close();
	    st.close();
	    con.close();*/
	    //�ݴ´ٴ� ���� ��� �ڿ��� �������� ��
	    
	    
	   /*rs.next();
	    //������ �ִ� ���ڵ� �ϳ� �����
	    String mid1;
	    mid1 = rs.getString("MID");
	    System.out.println(mid1);*/
		
		
		
		
		
		
		/*//Controller==========================================================
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� id�� �Է��Ͻÿ� : ");	
		String x = scan.next();
		
		MemberDao memberDao = new OracleMemberDao();
		List<Member> list = memberDao.getList(x);
		
		//Model===============================================================
		
		//View================================================================
	    for(Member m:list)
	    	System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",m.getMid(),m.getPwd());

	    Member i = new Member();
	    i.setMid("����");
	    i.setPwd("658946");
	    i.setName("����");
	    
	    memberDao.add(i);
	    
	    list = memberDao.getList(x);
	    
	    
	    System.out.println("---------------------------------------------");
	    //View================================================================
	    for(Member m:list)
	    	System.out.printf("���̵�� '%s' ��й�ȣ�� '%s'\n",m.getMid(),m.getPwd());
	    */
	    
	    
	    
	    
	    
		
		
		
	    
	    //=====����===============================================================
	    
		end:while(true)
		{
			
			System.out.println("����������������������������������������������");
			System.out.println("��        ����  �޴�               ��");	
			System.out.println("����������������������������������������������");  
			System.out.println("	1.ȸ������");
			System.out.println("	2.�Խñ� ����");
			System.out.println("	3.����");
			System.out.print("	>");
			Scanner scan = new Scanner(System.in);
	
			int menu=scan.nextInt();
			
			switch(menu)
			{
				case 1 : 
					System.out.println("����������������������������������������������");
					System.out.println("��        ȸ��  ����               ��");	
					System.out.println("����������������������������������������������");  
					System.out.println("���̵�	�̸�		��ȭ��ȣ");
					
					MemberDao memberDao = new OracleMemberDao();
					List<Member> list = memberDao.getList();
					for(Member m:list)
						System.out.printf("'%s' '%s' '%s'\n",m.getMid(),m.getName(),m.getPhone());
					
					System.out.println("1.�߰� 2.���� 3.���� 4.�����޴�");
					System.out.print("�޴�>");
						int smenu=scan.nextInt();
							
						switch(smenu)
						{
							case 1 :
								do{
									System.out.println("����������������������������������������������");
									System.out.println("��        ȸ��  �߰�               ��");	
									System.out.println("����������������������������������������������");  
									System.out.println("���̵�: ");
									
									System.out.println("��й�ȣ: ");
									System.out.println("�̸�: ");
									String nm=scan.next();
									System.out.println("����: ");
									System.out.println("����: ");
									System.out.println("����: ");
									System.out.println("����: ");
									System.out.println("�ּ�: ");
									System.out.println("SSN: ");
									System.out.println("IP: ");
									System.out.println("���: ");
									System.out.println("��ȭ��ȣ: ");
									String ph=scan.next();
									
			
									System.out.println("����Է��Ͻðڽ��ϱ�?(y/n)");
								}while(scan.next()=="y");
									
								
							case 2 :
								
								
								
							case 3 :
								
								
								
							case 4 : 
								break;
						}
					
					
					break;
					
				case 2 :
					break;
					
				case 3 :
					break end;
			}
		    
			
			
		}
	    
	    
	}

}
