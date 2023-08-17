package LFS.board.vo;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class boardVo {

	// TB_BOARD
		private Long id;			// 번호(PK)
		private String title;		// 제목
		private String content;		// 내용
		private String writer;		// 작성자
		private int readCnt;		// 조회수
		//private String noticeYn;	// 공지 여부
		//private String secretYn;	// 비밀 여부
		//private String deleteYn;	// 삭제 여부
		private LocalDateTime insertTime;	// 등록일
		private LocalDateTime updateTime;	// 수정일
		
	}
