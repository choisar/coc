package com.spring.finalpro.product.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ProductImageDTO {
	private int no;
	private String productNo;
	private String imageFileName;
	private Date regDate;
}
