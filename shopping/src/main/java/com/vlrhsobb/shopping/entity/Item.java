package com.vlrhsobb.shopping.entity;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
  private Long id; // 상품 코드

  private String itemNm; // 상품명
  private String category; // 상품 카테고리
  private String brand; // 브랜드 이름

  private int price; // 상품 가격 (원가)
  private int discountRate; // 할인율
  private int salePrice; // 할인 적용된 가격

  private int stockNumber; // 재고수량
  private String itemDetail; // 상품 상세 설명
  private ItemSellStatus itemSellStatus; // 상품 판매 상태

  // 일단 주석처리하고 나중에 기능 추가할 때 생각
//  private String imageUrl; // 썸네일 이미지 URL
//  private int reviewCount; // 리뷰 개수
//  private double averegeRating; // 평균 평점
//  private int likeCount; // 좋아요 개수

  private LocalDateTime regTime; // 등록 시간
  private LocalDateTime updateTime; // 수정 시간

}
