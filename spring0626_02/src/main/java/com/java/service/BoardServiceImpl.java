package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.BoardDto;
import com.java.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public ArrayList<BoardDto> selectAll() {
		// 게시글 전체 가져오기 
		ArrayList<BoardDto> list =boardMapper.selectAll();
		return list;
	}

	@Override
	public BoardDto selectOne(int bno) {
		//게시긇 1개 가져오기 
		BoardDto bdto = boardMapper.selectOne(bno);
		return bdto;
	}

	@Override
	public void insertOne(BoardDto bdto) {
		// 게시글 1개 저장
		boardMapper.insertOne(bdto);
	}

	
}
