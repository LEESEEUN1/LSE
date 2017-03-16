package com.newlecture.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.data.dao.MemberDao;
import com.newlecture.web.data.entity.Member;

public class OracleMemberDao implements MemberDao {

	@Override
	public List<Member> getList() 
	{
		String spl = "SELECT MID, NAME, PHONE FROM MEMBER";
		List<Member> list = new ArrayList<>();
	
	    try 
	    {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(spl);
	   
		    Member member=null;
	    
		    while(rs.next())
		    {
		    	member=new Member();
			    member.setMid(rs.getString("MID"));
			    member.setName(rs.getString("NAME"));
			    member.setPhone(rs.getString("PHONE"));
			    list.add(member);
		    }
		    
		    rs.close();
		    st.close();
		    con.close();
	    
		} 
		    catch (ClassNotFoundException e) 
		    {
		        e.printStackTrace();
		    } 
		    catch (SQLException e) 
		    {
		        e.printStackTrace();
		    }

	    return list;
	}
	
	
	
	
	
	@Override
	public int add(Member member) 
	{
		String sql = "INSERT INTO MEMBER(MID, PWD, NAME, GENDER,  AGE, BIRTHDAY, MAJOR, ADDRESS, PHONE, SSN, IP, REGDATE, BOSS) VALUES(?,?,?,?,?,?,?,?,?,?,?,SYSDATE,?)";
		//'"+memeber.getMID()+"'쓰기 힘드니까 ?로 비워둠
	    try 
	    {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
		    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    
		    PreparedStatement st = con.prepareStatement(sql);
		    st.setString(1, member.getMid());
		    st.setString(2, member.getPwd());
		    st.setString(3, member.getName());
		    st.setString(4, member.getGender());
		    st.setInt(5, member.getAge());
		    st.setString(6, member.getBirthday());
		    st.setString(7, member.getMajor());
		    st.setString(8, member.getAddress());
		    st.setString(9, member.getSsn());
		    st.setString(10, member.getIp());
		    st.setString(4, member.getBoss());
		    st.setString(4, member.getPhone());
		    
		    
		    
		    //결과가 있는 쿼리 executeQuery()
		    //select
		    //결과가 없는 쿼리 updateQuery()
		    //insert/update/delete
		    int result = st.executeUpdate();
	    
		    st.close();
		    con.close();
	    
		    return result;
	   
	    } 
		    catch (ClassNotFoundException e) 
		    {
		        e.printStackTrace();
		    } 
		    catch (SQLException e) 
		    {
		        e.printStackTrace();
		    }

		 return 0;
	}

	@Override
	public int change(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
