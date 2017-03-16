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
		//사용자의 요구 받아서 그 원하는 데이터 가져옴
		
		/*String sql = "SELECT  * FROM MEMBER WHERE MID LIKE '%a%'";//a가 포함된 id만 출력하는 쿼리문
      
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    rs.next();
	    //서버에 있는 레코드 하나 갖고옴
	     
	    String mid;
	    String pwd;
	    //mid와 pwd가 모델>지금 이 상태는 논리적으로만 나눈 것	
	    
	    //구조적인 데이터를 사용하는 이유
	    //구조적인 데이터=사용자 형식=개체=entity
	    //구조화한다=그룹핑한다(데이터를 설명하는 이름이 붙게 됨)
	    //ex) 
	    //int나이,int학년,String이름,int성별 > 학생정보
	    //String일자,int가격,int기간  > 수강정보
	    //이것들을 업무에 따라서 정의되는 형식을 자료형으로 만듦->이것이 바로 구조화
	    //속성을 널부러트리지 않고 우리가 이해할 수 있는 개념적인 데이터로 묶은것이 구조화
	    //구조적인 데이터를 사용하는 이유
	    //1.
	    //2.
	    //3. 
	    
	    String mid=null;
	    String pwd=null;
	    //남일경우 남성, 여일경우 여성으로 출력
	    String gender=null;
	    //mid pwd gender는 널부러진 데이터 이것들을 개념적으로 봤을때 member들의 데이터, Member 자료형이 됨.
	    //개념상의 데이터들이 시각적으로 보여야 함 그것이 바로Member 자료형
	    
	    
	    //목록을 가져오는 작업
	    
	    Member member=null;
	    List<Member> list = new ArrayList<>();
	    
	    while(rs.next())
	    {
	    	member=new Member();
		    member.setPwd(rs.getString("PWD"));
		    member.setMid(rs.getString("MID"));
		    //gender = rs.getNString("GENDER");
		    //System.out.printf("아이디는 '%s' 비밀번호는 '%s' 성별은 남성\n",mid,pwd); //출력=view를  가져올 필요가 없음.
		    list.add(member);
	    }//데이터를 제공해주는 코드
	    
	    rs.close();
	    st.close();
	    con.close();
	    
	    ==>이제 이것을 잘라서 데이터를 가져올 클래스를 따로 만듦 jdbc.dao에 여러가지 데이터를 가져오는 클래스 있음
	     jdbc.dao>MemberDao
	     	클래스를 분리시켜놓음으로써 협업이 가능해짐. 
	     	출력과 데이터를 가져오는 작업(데이터서비스)이 분리됐기 때문에 (한 클래스에 있지 않기 때문에) 
	     	따로 작업 가능*/
	    
	    
	    //Model===============================================================
	    //원래는 컨트롤러(데이터를 가져오는 작업)과 뷰(데이터를 출력하는 작업)이 동기화 돼 있음->
	    //데이터 가져오는 것과 출력하는 것이 섞이면 복잡해짐
	    //실행 성능이 안좋아짐
	    //재사용이 불가능한 상태
	    //데이터를 가져오는 시간이 길어지면 출력을 위해 기다려야 하는 시간이 길어짐
	    //동기화가 되면 서로 기다려야 하는 시간이 길어지기 때문에 데이터를 담아놓고 그 것을 가져다 쓸 수 있도록 함.
	    
	    //분리하기 위해 담아놓는 그릇이 필요하게 됨=모델
	    //출력할 데이터 모아주는곳 =출력하기 위한 데이터를 담아놓는 곳
	    //b, 따로 분리된 것은 아니라 수집돼서 사용되는 형태기 때문에 컨트롤러와 뷰 사이에 걸쳐있음
	    //이것이 바로 MVC1
	    
	    
	   /* //View================================================================
	    //제공된 데이터를 출력하는 코드
		 for(Member m:list)
			    System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",m.getMid(),m.getPwd());*/
		
		//System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",member.getMid(),member.getPwd());
	    //mid와 pwd가 모델>지금 이 상태는 논리적으로만 나눈 것
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 회원검색 프로그램 숙제
		 * System.out.println("		[회원 검색 프로그램]");
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 분류 아이디(1) 이름(2) 나이(3) : ");
		
		String x = scan.next();
		
		System.out.print("검색어 입력  : ");
		
		String y = scan.next();
		
		MemberDao memberDao = new MemberDao();
		List<Member> list = memberDao.getList(x, y);
		
		
		for(Member m:list)
	    	System.out.printf("%-10s %-10s %-10d\n",m.getMid(),m.getName(),m.getAge());
*/
		
		
		
		
		
		
		/*Scanner scan1 = new Scanner(System.in);
		System.out.print("검색할"+x+"를 입력하시오 : ");*/
		
		
		
		/*
		//Controller==========================================================
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 id를 입력하시오 : ");
		
		String x = scan.next();
		
		MemberDao memberDao = new MemberDao();
		List<Member> list = memberDao.getList(x);
		
		//Model===============================================================
		
		//View================================================================
	    for(Member m:list)
	    	System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",m.getMid(),m.getPwd());

	    */

	    /*while(rs.next())
	    {
		    pwd = rs.getString("PWD");
		    mid = rs.getString("MID");
		    //if(mid.contains("a"))//a가 포함된 id만 출력하는 것
		    System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",mid,pwd);
		    
	    }*/

	    /*while(rs.next())
	    {

		    pwd = rs.getString("PWD");
		    mid = rs.getString("MID");
		    System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",mid,pwd);
		    
	    }
	    
	    rs.close();
	    st.close();
	    con.close();*/
	    //닫는다는 것은 썼던 자원을 정리해준 것
	    
	    
	   /*rs.next();
	    //서버에 있는 레코드 하나 갖고옴
	    String mid1;
	    mid1 = rs.getString("MID");
	    System.out.println(mid1);*/
		
		
		
		
		
		
		/*//Controller==========================================================
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 id를 입력하시오 : ");	
		String x = scan.next();
		
		MemberDao memberDao = new OracleMemberDao();
		List<Member> list = memberDao.getList(x);
		
		//Model===============================================================
		
		//View================================================================
	    for(Member m:list)
	    	System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",m.getMid(),m.getPwd());

	    Member i = new Member();
	    i.setMid("슉슉");
	    i.setPwd("658946");
	    i.setName("누구");
	    
	    memberDao.add(i);
	    
	    list = memberDao.getList(x);
	    
	    
	    System.out.println("---------------------------------------------");
	    //View================================================================
	    for(Member m:list)
	    	System.out.printf("아이디는 '%s' 비밀번호는 '%s'\n",m.getMid(),m.getPwd());
	    */
	    
	    
	    
	    
	    
		
		
		
	    
	    //=====숙제===============================================================
	    
		end:while(true)
		{
			
			System.out.println("┌─────────────────────┐");
			System.out.println("│        메인  메뉴               │");	
			System.out.println("└─────────────────────┘");  
			System.out.println("	1.회원관리");
			System.out.println("	2.게시글 관리");
			System.out.println("	3.종료");
			System.out.print("	>");
			Scanner scan = new Scanner(System.in);
	
			int menu=scan.nextInt();
			
			switch(menu)
			{
				case 1 : 
					System.out.println("┌─────────────────────┐");
					System.out.println("│        회원  관리               │");	
					System.out.println("└─────────────────────┘");  
					System.out.println("아이디	이름		전화번호");
					
					MemberDao memberDao = new OracleMemberDao();
					List<Member> list = memberDao.getList();
					for(Member m:list)
						System.out.printf("'%s' '%s' '%s'\n",m.getMid(),m.getName(),m.getPhone());
					
					System.out.println("1.추가 2.수정 3.삭제 4.상위메뉴");
					System.out.print("메뉴>");
						int smenu=scan.nextInt();
							
						switch(smenu)
						{
							case 1 :
								do{
									System.out.println("┌─────────────────────┐");
									System.out.println("│        회원  추가               │");	
									System.out.println("└─────────────────────┘");  
									System.out.println("아이디: ");
									
									System.out.println("비밀번호: ");
									System.out.println("이름: ");
									String nm=scan.next();
									System.out.println("성별: ");
									System.out.println("나이: ");
									System.out.println("생일: ");
									System.out.println("전공: ");
									System.out.println("주소: ");
									System.out.println("SSN: ");
									System.out.println("IP: ");
									System.out.println("상사: ");
									System.out.println("전화번호: ");
									String ph=scan.next();
									
			
									System.out.println("계속입력하시겠습니까?(y/n)");
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
