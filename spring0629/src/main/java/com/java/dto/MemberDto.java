package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //전체생성
@NoArgsConstructor //기본생성자
@Data //게터 세터
public class MemberDto {

	private String id,pw,name,phone,gender;
	private String[] hobbys;
	private String hobby;
	
}
