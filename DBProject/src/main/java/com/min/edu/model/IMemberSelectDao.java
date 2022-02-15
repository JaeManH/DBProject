package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.MemberVo;

public interface IMemberSelectDao {
	
	public MemberVo selectMember_update(int id);
	
	public MemberVo chkLogId(String logId);
	
	public MemberVo chkPwd(String pwd);
}
