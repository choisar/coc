package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class QuestionDTO {
	private int questionNo;
	private int answerCnt;
	private String memberId;
	private String productNo;
	private String title;
	private String content;
	private String imageFileName;
	private Date regDate;
}
