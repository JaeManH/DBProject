package com.min.edu.model;

import com.min.edu.vo.QnAVo;
import com.min.edu.vo.QnA_CVo;

public interface QnAIDUDao {

	public int insert01(QnAVo vo);
	
	public int qna_c_insert01(QnA_CVo vo);
}
