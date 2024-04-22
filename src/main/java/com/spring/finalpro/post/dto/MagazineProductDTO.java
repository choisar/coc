package com.spring.finalpro.post.dto;

import lombok.Data;

@Data
public class MagazineProductDTO {
	private String productNo;
	private String brand;
	private String name;
	private int price;
	private int totalLikes;
}
