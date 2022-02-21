package com.min.edu.model;

import java.util.Map;

import com.min.edu.vo.MemberVo;

public interface MemberIDUDao {
	
	public int insert01(MemberVo vo);

	public MemberVo chkLogIdPwd(Map<String, Object> map);

}
