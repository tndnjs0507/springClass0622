package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.BoardDto;
import com.java.dto.CommentDto;
import com.java.service.BoardService;

@Controller
//@RestController
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/notice")
	public String notice(Model model) {
		ArrayList<BoardDto> list = new ArrayList<>();
		//게시글 전체 가져오기
		list = boardService.selectAll();
		model.addAttribute("list", list);
		
		return "board/notice";
	}

	@RequestMapping("/board/noticeView")
	public String noticeView(int bno, Model model) {
		//게시글 1개 가져오기
		BoardDto bdto = boardService.selectOne(bno);
		//하단댓글 모두 가져오기
		ArrayList<CommentDto> comList = boardService.selectComAll(bno);
		
		model.addAttribute("bdto", bdto);
		model.addAttribute("comList", comList);
		return "board/noticeView";
	}
	
	@RequestMapping("/board/commentInsert")
	@ResponseBody
	public CommentDto commentInsert(CommentDto comDto) {
		System.out.println("ajax 넘어온 데이터1:"+comDto.getCcontent());
		//하단댓글 저장
		CommentDto cdto = boardService.commentInsert(comDto);
		
		
		return cdto;
	}
}
