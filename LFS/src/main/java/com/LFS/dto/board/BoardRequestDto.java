package com.LFS.dto.board;

import com.LFS.entity.board.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 * 게시판 요청 데이터를 담당
 */

//게시물 등록, 게시물 수정, 게시물 상세 조회에 필요한 필드를 정의한다.
//toEntity() 메서드는 Board Entity를 builder 하여 사용한다.

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {
	private Long id;
	private String title;
	private String content;
	private String registerId;
	
	public Board toEntity() {
		return Board.builder()
			.title(title)
			.content(content)
			.registerId(registerId)
			.build();
	}
}