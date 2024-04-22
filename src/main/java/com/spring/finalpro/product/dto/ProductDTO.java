package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ProductDTO {
	private String productNo;
	private String parentProductNo;
	private String name;
	private String brand;
	private String brandEng;
	private String gender;
	private int price;
	private String category;
	private String subCategory;
	private Date regDate;
	private int viewCount;
	private int likeCount;
	private String color1;
	private String color2;
	private String color3;
	private String material;
}
