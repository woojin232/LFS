package LFS.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import LFS.board.service.boardService;

@Controller
public class controller {

	@Autowired
	boardService boardservice;
	
	@GetMapping("home")
    public String home(){
        return "home";
    }
	@GetMapping("/board/list.do")
    public String homae(){
        return "board/list";
    }
	
//	//게시글 작성 get
//	@GetMapping("/board/write.do")
//    public String wrtie(@RequestParam(value = "idx", required = false) Long idx, Model model) {
//		
//		model.addAttribute("board", new BoardDTO());
//
//		return "board/write";
//	}
//	
//
//	// 게시글 작성 POST
//	@PostMapping(value = "/board/register.do")
//	public String registerBoard(final BoardDTO params) {
//		try {
//			boolean isRegistered = boardService.registerBoard(params);
//			if (isRegistered == false) {
//				// TODO => 게시글 등록에 실패하였다는 메시지를 전달
//			}
//		} catch (DataAccessException e) {
//			// TODO => 데이터베이스 처리 과정에 문제가 발생하였다는 메시지를 전달
//
//		} catch (Exception e) {
//			// TODO => 시스템에 문제가 발생하였다는 메시지를 전달
//		}
//
//		return "redirect:/board/list.do";
//	}
}
