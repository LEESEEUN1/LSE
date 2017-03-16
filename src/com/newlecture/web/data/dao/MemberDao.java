package com.newlecture.web.data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.data.entity.Member;

//출력과 데이터를 가져오는 작업이 분리됐기 때문에 (한 클래스에 있지 않기 때문에) 따로 작업 가능
public interface MemberDao {
	
	List<Member> getList(String query);
	int add(Member member);

	/*public List<Member> getList(String x,String y) throws ClassNotFoundException, SQLException{
		
		
		if(x.equals("1"))
			y = "SELECT * FROM MEMBER WHERE MID LIKE '%"+y+"%'";

		else if(x.equals("2"))
			y = "SELECT * FROM MEMBER WHERE NAME LIKE '%"+y+"%'";

		else if(x.equals("3"))
			y = "SELECT * FROM MEMBER WHERE AGE LIKE '%"+y+"%'";
		
		
		//SELECT 정렬하기 집계하기 합치기 ...등등
		String sql = "SELECT  * FROM MEMBER WHERE MID LIKE '%"+x+"%'";
		//a가 포함된 id만 출력하는 쿼리문
		//a가 박히면 안됨. 그러면 사용자의 요구를 받지 못함.
		//사용자에게 무엇을 받을건지 물어봐야 함
	      
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    ResultSet rs = st.executeQuery(y);
	    
	    //목록을 가져오는 작업
	    
	    List<Member> list = new ArrayList<>();
	    Member member=null;
	    
	    while(rs.next())
	    {
	    	member=new Member();
		    member.setPwd(rs.getString("PWD"));
		    member.setMid(rs.getString("MID"));
		    member.setName(rs.getString("NAME"));
		    member.setAge(rs.getInt("AGE"));
		    //gender = rs.getNString("GENDER");
		    //System.out.printf("아이디는 '%s' 비밀번호는 '%s' 성별은 남성\n",mid,pwd); //출력=view를  가져올 필요가 없음.
		    list.add(member);
	    }//데이터를 제공해주는 코드
	    
	    rs.close();
	    st.close();
	    con.close();
	    
	    return list;
	}*/
}
