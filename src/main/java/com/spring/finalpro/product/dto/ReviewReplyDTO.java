package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewReplyDTO {
	private int replyNo;
	private int parentReplyNo;
	private String memberId;
	private int reviewNo;
	private String content;
	private Date regDate;
	private int childReplyCount;
}
