package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewDTO {
	private int reviewNo;
	private int orderNo;
	private String memberId;
	private String productNo;
	private String productSize;
	private Integer starScore;
	private Integer sizeAssessment;
	private Integer brightAssessment;
	private Integer colorAssessment;
	private Integer thickAssessment;
	private Integer deliveryAssessment;
	private Integer packAssessment;
	private String content;
	private String imageFileName;
	private Date regDate;
	private String gender;
	private String productName;
	private String memberGender;
	private Integer memberHeight;
	private Integer memberWeight;
	private Integer replyCount;
	private Double height;
	private Double weight;
	private String brand;
	private String name;
	private String productImageFileName;
}
