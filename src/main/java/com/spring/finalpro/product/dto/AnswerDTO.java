package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class AnswerDTO {
	private int answerNo;
	private int questionNo;
	private String title;
	private String content;
	private String imageFileName;
	private Date regDate;
}
