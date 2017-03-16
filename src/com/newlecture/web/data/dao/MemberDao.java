package com.newlecture.web.data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.data.entity.Member;

//��°� �����͸� �������� �۾��� �и��Ʊ� ������ (�� Ŭ������ ���� �ʱ� ������) ���� �۾� ����
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
		
		
		//SELECT �����ϱ� �����ϱ� ��ġ�� ...���
		String sql = "SELECT  * FROM MEMBER WHERE MID LIKE '%"+x+"%'";
		//a�� ���Ե� id�� ����ϴ� ������
		//a�� ������ �ȵ�. �׷��� ������� �䱸�� ���� ����.
		//����ڿ��� ������ �������� ������� ��
	      
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    ResultSet rs = st.executeQuery(y);
	    
	    //����� �������� �۾�
	    
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
		    //System.out.printf("���̵�� '%s' ��й�ȣ�� '%s' ������ ����\n",mid,pwd); //���=view��  ������ �ʿ䰡 ����.
		    list.add(member);
	    }//�����͸� �������ִ� �ڵ�
	    
	    rs.close();
	    st.close();
	    con.close();
	    
	    return list;
	}*/
}
