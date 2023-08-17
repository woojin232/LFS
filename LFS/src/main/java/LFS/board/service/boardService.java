package LFS.board.service;

import java.sql.SQLException;
import java.util.List;

import LFS.board.vo.boardVo;

public interface boardService {
	
	// 게시판 목록
	public List<boardVo> viewBbsList(boardVo boardvo) throws SQLException;

	// 공지사항 목록
//	public List<?> viewNoticeList(EgovMap map) throws SQLException, IOException;

	// 게시판 목록 카운트
//	public int viewBbsTotCnt(EgovMap map) throws SQLException, IOException;

//	public List<BoardVo> selectTest(BoardVo boardVo) throws Exception;

//	public void insertTest(BoardVo boardVo) throws Exception;

	//public BoardVo selectDetail(int bno) throws Exception;

	//public void updateTest(BoardVo BoardVo) throws Exception;

	//public void deleteTest(int bno) throws Exception;

}
