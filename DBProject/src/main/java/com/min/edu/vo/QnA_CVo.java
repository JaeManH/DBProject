package com.min.edu.vo;

import java.io.Serializable;

public class QnA_CVo implements Serializable{

	
	private static final long serialVersionUID = 794836163380145189L;
	private String qna_answer;
	
	public QnA_CVo() {
	}

	@Override
	public String toString() {
		return "QnA_CVo [qna_answer=" + qna_answer + "]";
	}

	public QnA_CVo(String qna_answer) {
		super();
		this.qna_answer = qna_answer;
	}

	public String getQna_answer() {
		return qna_answer;
	}

	public void setQna_answer(String qna_answer) {
		this.qna_answer = qna_answer;
	}
	
}
