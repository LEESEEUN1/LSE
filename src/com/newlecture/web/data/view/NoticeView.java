package com.newlecture.web.data.view;

import com.newlecture.web.data.entity.Notice;

public class NoticeView extends Notice {
	//이곳에 확장될 것을 넣음
	String writerName;
	int commentCount;
	//데이터를 담는 그릇을 만듦
	//이제 그릇에 데이터를 담아야함
	//데이터는 서버가 갖고 있고 클라이언트는 데이터를 담을 수 있는 그릇(오브젝트)을 갖고 있음
	//데이터를 그릇에 담기 위한 서비스 모듈을 만들어야함 > 이것이 바로  dao
	//구현이 중요한 것이 아니라 무엇을 구현할 것이지가 중요 > dao에 무엇을 구현할 것인지 notice인터페이스를 만듦
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	
	
	
}
