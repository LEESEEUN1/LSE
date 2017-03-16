package com.newlecture.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.data.dao.NoticeDao;
import com.newlecture.web.data.entity.Member;
import com.newlecture.web.data.entity.Notice;
import com.newlecture.web.data.view.NoticeView;

public class OracleNoticeDao implements NoticeDao{

	
	public List<NoticeView> getList() {
		
		return getList(1,"TITLE","");
	}

	
	public List<NoticeView> getList(int page) {
		
		return getList(page,"TITLE","");
	}

	
	public List<NoticeView> getList(int page, String field, String query) {
		
		String sql = "SELECT CODE,TITLE,WRITER,CONTENT,REGDATE,HIT FROM NOTICE_VIEW";
		List<NoticeView> list = new ArrayList<>();
	
	    try 
	    {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sql);
	   
		    Notice notice=null;
	    
		    while(rs.next())
		    {
		    	notice=new Notice();
			    notice.setCode(rs.getString("CODE"));
			    notice.setTitle(rs.getString("TITLE"));
			    notice.setWriter(rs.getString("WRITER"));
			    notice.setCotent(rs.getString("CONTENT"));
			    notice.setHit(rs.getInt("HIT"));
			    notice.setRegDate(rs.getDate("REGDATE"));
			    list.add(NoticeView);
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


	
	
}
