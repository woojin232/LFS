package LFS.board.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LFS.board.vo.boardVo;


@Service("boardServiceimpl")
public class boardServiceimpl {

	@Autowired
	private boardDaoImpl boardDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(boardServiceimpl.class);
	// 게시글 조회
//		@Override
//		public List<boardVo> viewBbsList(boardVo boardvo) throws SQLException {
//			try {
//				return boardDao.viewBbsList(boardvo);
//			} catch (IOException e) { // 시큐어 코드
//				LOGGER.error("#################### IOException: " + e);
//			} catch (SQLException e) { // 시큐어 코드
//				LOGGER.error("#################### SQLException: " + e);
//			} catch (Exception e) {
//				LOGGER.error("#################### Exception: " + e);
//			} 
//			
//			return null;
//		}
}
