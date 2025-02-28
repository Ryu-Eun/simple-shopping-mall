package com.vlrhsobb.shopping.entity;


/*
*
* 모종의 이유로 판매가 긴급하게 중지되었으면 STOPPED로 변경
* 품절상태에서 재고가 추가되면 SELL로 변경
*
* */
public enum ItemSellStatus {
  SELL,           // 판매 중
  SOLD_OUT,       // 품절
  RESERVED,       // 예약
  STOPPED,        // 판매 중지 (관리자에 의해 중지됨)
  DISCONTINUED,   // 단종 (재입고 불가)
}
