package com.newlecture.web.data.view;

import com.newlecture.web.data.entity.Notice;

public class NoticeView extends Notice {
	//�̰��� Ȯ��� ���� ����
	String writerName;
	int commentCount;
	//�����͸� ��� �׸��� ����
	//���� �׸��� �����͸� ��ƾ���
	//�����ʹ� ������ ���� �ְ� Ŭ���̾�Ʈ�� �����͸� ���� �� �ִ� �׸�(������Ʈ)�� ���� ����
	//�����͸� �׸��� ��� ���� ���� ����� �������� > �̰��� �ٷ�  dao
	//������ �߿��� ���� �ƴ϶� ������ ������ �������� �߿� > dao�� ������ ������ ������ notice�������̽��� ����
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
