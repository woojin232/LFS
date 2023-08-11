package com.LFS.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LFS.dto.board.BoardResponseDto;
import com.LFS.dto.board.BoardResponseDto;
import com.LFS.dto.board.BoardRequestDto;
import com.LFS.entity.board.Board;
import com.LFS.entity.board.BoardRepository;

import lombok.RequiredArgsConstructor;
/*
 * 게시판 @Service
 */

//게시판 기능을 담당할 Service 클래스로 나중에 파일 및 페이징 처리를 추가할 예정이다.
//지금은 간단한 CRUD 메서드만 작성한다.

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
	@Transactional
	public Long save(BoardRequestDto boardSaveDto) {
		return boardRepository.save(boardSaveDto.toEntity()).getId();
	}
	
	/*
		Ʈ����ǿ� readOnly=true �ɼ��� �ָ� ������ �����ӿ�ũ�� ���̹�����Ʈ ���� �÷��� ��带 MANUAL�� �����Ѵ�.
		�̷��� �ϸ� ������ �÷��ø� ȣ������ �ʴ� �� �÷��ð� �Ͼ�� �ʴ´�.
		���� Ʈ������� Ŀ���ϴ��� ���Ӽ� ���ؽ�Ʈ�� �÷��� ���� �ʾƼ� ��ƼƼ�� ���, ����, ������ �������� �ʰ�,
		���� �б� ��������, ���Ӽ� ���ؽ�Ʈ�� ���� ������ ���� �������� �������� �����Ƿ� ������ ���ȴ�.
	*/
	@Transactional(readOnly = true)
	public List<BoardResponseDto> findAll() {
		return  boardRepository.findAll().stream().map(BoardResponseDto::new).collect(Collectors.toList());
	}
	
	public BoardResponseDto findById(Long id) {
		return new BoardResponseDto(boardRepository.findById(id).get());
	}
	
	public int update(BoardRequestDto boardRequestDto) {
		return boardRepository.updateBoard(boardRequestDto);
	}
	
	public void delete(Long id) {
		boardRepository.deleteById(id);
	}
}
