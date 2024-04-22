package com.spring.finalpro.mypage.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MypageDTO {
   
   private int no;
   private String memberId;
   private String imageFileName;
   private String brand;
   private String name;
   private String subcategory;
   private String productSize;
   private Date orderDate;
   private int orderNo;
   private String orderPrice;      // 상품 가격 * 수량
   private String deliveryStatus;
   private int quantity;
   private int likeCount;
   private int inlike;
   private int inbascket;
   private String price;   // 상품 가격
   private String productNo;
   private String color1;
   private int count;
   private int stock;   
   private int checkReview;   // 리뷰 작성 확인
   
   // 배송
   private int deliveryRequest;      // 요청사항
   private String receiverName;
   private String receiverPhone;
   private String receiverAdress;
   private int payment;
   private int paymentCard;
   private int paymentMonth;
   private int paymentBank;
}