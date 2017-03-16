package com.newlecture.web.data.dao;

import java.util.List;

import com.newlecture.web.data.view.NoticeView;

public interface NoticeDao {
	
	List<NoticeView> getList();
	List<NoticeView> getList(int page);
	List<NoticeView> getList(int page, String field, String query);
	//���� ��Ƽ�� �ٿ��� �����ؾ���
	int getSize();
	int getSize(String field, String query);
}
