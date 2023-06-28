package com.java.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.java.dto.BoardDto;

@Mapper
public interface BoardMapper {

	//게시글 전체 가져오기
	ArrayList<BoardDto> selectAll();

	//게시글 1개 가져오기 
	BoardDto selectOne(int bno);

	//게시글 1개 저장
	void insertOne(BoardDto bdto);
 }
