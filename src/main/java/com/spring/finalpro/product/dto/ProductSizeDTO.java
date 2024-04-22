package com.spring.finalpro.product.dto;

import lombok.Data;

@Data
public class ProductSizeDTO {
	private String productNo;
	private String productSize;
	private String subCategory;
	private Integer stock;
	private Integer topTotalLength;
	private Integer shoulderLength;
	private Integer chestCrossLength;
	private Integer sleevelength;
	private Integer waistCrossLength;
	private Integer hipCrossLength;
	private Integer thighCrossLength;
	private Integer riseLength;
	private Integer hemCrossLength;
	private Integer footLength;
	private Integer ballOfFoot;
	private Integer ankleHeight;
	private Integer instepHeight;
}
