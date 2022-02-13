package com.min.edu.model;

import com.min.edu.vo.BoardVo;

public interface IBoardSelectDao {

	public BoardVo selectDetail(Object board_id);
}
