package com.newlecture.web.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.data.dao.NoticeDao;
import com.newlecture.web.data.entity.Member;
import com.newlecture.web.data.entity.Notice;
import com.newlecture.web.data.view.NoticeView;

public class MySQLNoticeDao implements NoticeDao{

	
	public List<NoticeView> getList() {
		
		return getList(1,"TITLE","");
	}

	
	public List<NoticeView> getList(int page) {
		
		return getList(page,"TITLE","");
	}

	
	public List<NoticeView> getList(int page, String field, String query) {
		
		String sql = "SELECT * FROM NOTICE_VIEW WHERE BINARY "+field+" LIKE ? LIMIT ?,10";
		List<NoticeView> list = new ArrayList<>();
	
	    try 
	    {
	    	Class.forName("com.mysql.jdbc.Driver");         
	        String url = "jdbc:mysql://211.238.142.84/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
	        Connection con = DriverManager.getConnection(url, "newlec", "sclass");
	        
		    PreparedStatement st = con.prepareStatement(sql);
		    st.setString(1, "%"+query+"%");
		    st.setInt(2, 10*(page-1));
		    
		    ResultSet rs = st.executeQuery();
		    
		    NoticeView noticeView = null;
	    
		    while(rs.next())
		    {
		    	noticeView = new NoticeView();
	            noticeView.setCode(rs.getString("CODE"));
	            noticeView.setTitle(rs.getString("TITLE"));
	            noticeView.setContent(rs.getString("CONTENT"));
	            noticeView.setWriter(rs.getString("WRITER"));
	            noticeView.setRegDate(rs.getDate("REGDATE"));
	            noticeView.setHit(rs.getInt("HIT"));
	            
	            noticeView.setWriterName(rs.getString("WRITER_NAME"));
	            noticeView.setCommentCount(rs.getInt("COMMENT_COUNT"));
	            
			    list.add(noticeView);
			    
			    
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
	public int getSize() {
		
		return getSize("TITLE","");
	}


	@Override
	public int getSize(String field, String query) {
		
		String sql = "SELECT COUNT(CODE) FROM NOTICE WHERE BINARY "+field+" LIKE ?";
		int size=0;
	
	    try 
	    {
	    	Class.forName("com.mysql.jdbc.Driver");         
	        String url = "jdbc:mysql://211.238.142.84/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
	        Connection con = DriverManager.getConnection(url, "newlec", "sclass");
	        
		    PreparedStatement st = con.prepareStatement(sql);
		    st.setString(1, "%"+query+"%");

		    ResultSet rs = st.executeQuery();

		    if(rs.next())
		    	 size = rs.getInt("SIZE");
		    
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

		return size;
	}


	
	
}
