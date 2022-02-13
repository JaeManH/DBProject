package com.min.edu.vo;

import java.io.Serializable;

public class QnAVo implements Serializable{

	
	private static final long serialVersionUID = 4725346525545805228L;
	private int qna_id;
	private String qna_title;
	private String qna_content;
	private String qna_regdate;
	private int qna_secret;
	
	public QnAVo() {
	}

	@Override
	public String toString() {
		return "QuAVo [qna_id=" + qna_id + ", qna_title=" + qna_title + ", qna_content=" + qna_content
				+ ", qna_regdate=" + qna_regdate + ", qna_secret=" + qna_secret + "]";
	}

	public int getQna_id() {
		return qna_id;
	}

	public void setQna_id(int qna_id) {
		this.qna_id = qna_id;
	}

	public String getQna_title() {
		return qna_title;
	}

	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}

	public String getQna_content() {
		return qna_content;
	}

	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}

	public String getQna_regdate() {
		return qna_regdate;
	}

	public void setQna_regdate(String qna_regdate) {
		this.qna_regdate = qna_regdate;
	}

	public int getQna_secret() {
		return qna_secret;
	}

	public void setQna_secret(int qna_secret) {
		this.qna_secret = qna_secret;
	}

	public QnAVo( String qna_title, String qna_content, String qna_regdate, int qna_secret) {
		super();
//		this.qna_id = qna_id;
		this.qna_title = qna_title;
		this.qna_content = qna_content;
		this.qna_regdate = qna_regdate;
		this.qna_secret = qna_secret;
	}
}
