package com.LFS.entity.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.LFS.dto.board.BoardRequestDto;
/*
 * JpaRepository 구현체
 */

//JpaRepository를 상속받아 CRUD의 기능을 담당하는 인터페이스를 생성한다.

//그리고 @Query을 사용한 JPQL 방식의 updateBoard() 메서드도 구현해본다.
//이 방식으로 쿼리를 직접 작성하여 사용할 수도 있다.

public interface BoardRepository extends JpaRepository<Board, Long> {
	
	String UPDATE_BOARD = "update board "
			+ "set title = :#{#boardRequestDto.title}, "
			+ "content = :#{#boardRequestDto.content}, "
			+ "update_time = NOW() "
			+ "where id = :#{#boardRequestDto.id}";
	
	@Transactional
	@Modifying
	@Query(value = UPDATE_BOARD, nativeQuery = true)
	public int updateBoard(@Param("boardRequestDto") BoardRequestDto boardRequestDto);
}
