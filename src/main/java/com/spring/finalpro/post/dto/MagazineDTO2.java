package com.spring.finalpro.post.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MagazineDTO2 {
	private int magazineNo;
	private String category;
	private String brand;
	private String brandEng;
	private String season;
	private String title;
	private String subTitle;
	private String content;
	private String editor;
	private Date regDate;
	
}
