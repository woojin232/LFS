package LFS.board.service.impl;

import java.util.List;

import LFS.board.vo.boardVo;

public interface boardDao {

	// 게시판 글 목록
	public List<boardVo> viewBbsList(boardVo boardvo) throws Exception;
		
}
