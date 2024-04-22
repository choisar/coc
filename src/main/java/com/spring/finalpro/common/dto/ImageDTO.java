package com.spring.finalpro.common.dto;

import java.sql.Date;

import lombok.Data;

@Data 
public class ImageDTO {
	private int no;
	private String imageFileName;
	private Date regDate;
	private String productNo;
	private String brand;
	private String introduce;
	private String bannerImageFileName;
	private String magazineNo;
	private String title;
	private String subTitle;
	private String content;
	private int imageNumber;
}
