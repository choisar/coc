package com.spring.finalpro.post.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MagazineDTO {
	private int magazineNo;
	private String category;
	private String brand;
	private String season;
	private String title;
	private String subTitle;
	private String content;
	private String staff;
	private String editor;
	private String model;
	private String photographer;
	private String designer;
	private String assist;
	private int imageNumber;
	private Date regdate;
}
