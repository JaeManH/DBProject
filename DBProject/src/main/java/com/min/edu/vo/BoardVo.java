package com.min.edu.vo;

import java.io.Serializable;

public class BoardVo implements Serializable {

	private static final long serialVersionUID = 2349843084203760897L;
	
	private int BOARD_ID     ;
	private String BOARD_WRITER ;
	private String BOARD_TITLE  ;
	private String BOARD_CONTENT;
	private String BOARD_REGDATE;
	
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVo(int bOARD_ID, String bOARD_WRITER, String bOARD_TITLE, String bOARD_CONTENT, String bOARD_REGDATE) {
		super();
		BOARD_ID = bOARD_ID;
		BOARD_WRITER = bOARD_WRITER;
		BOARD_TITLE = bOARD_TITLE;
		BOARD_CONTENT = bOARD_CONTENT;
		BOARD_REGDATE = bOARD_REGDATE;
	}

	@Override
	public String toString() {
		return "BoardVo [BOARD_ID=" + BOARD_ID + ", BOARD_WRITER=" + BOARD_WRITER + ", BOARD_TITLE=" + BOARD_TITLE
				+ ", BOARD_CONTENT=" + BOARD_CONTENT + ", BOARD_REGDATE=" + BOARD_REGDATE + "]";
	}

	public int getBOARD_ID() {
		return BOARD_ID;
	}

	public void setBOARD_ID(int bOARD_ID) {
		BOARD_ID = bOARD_ID;
	}

	public String getBOARD_WRITER() {
		return BOARD_WRITER;
	}

	public void setBOARD_WRITER(String bOARD_WRITER) {
		BOARD_WRITER = bOARD_WRITER;
	}

	public String getBOARD_TITLE() {
		return BOARD_TITLE;
	}

	public void setBOARD_TITLE(String bOARD_TITLE) {
		BOARD_TITLE = bOARD_TITLE;
	}

	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}

	public void setBOARD_CONTENT(String bOARD_CONTENT) {
		BOARD_CONTENT = bOARD_CONTENT;
	}

	public String getBOARD_REGDATE() {
		return BOARD_REGDATE;
	}

	public void setBOARD_REGDATE(String bOARD_REGDATE) {
		BOARD_REGDATE = bOARD_REGDATE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
