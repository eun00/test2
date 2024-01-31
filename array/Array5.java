package array;

import java.util.Scanner;

public class Array5 {
  public static void main(String[] args) {
/*
 자판기[키오스크] 프로그램
 조건1 : 메뉴 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
 조건2 : 초기 재고는 각 제품별로 10개씩
 조건2 : 제품 메뉴 선택시 장바구니에 담는다.
 조건3 : 결제 메뉴 선택시 장바구니내 모든 제품을 한번에 결제한다.
 조건4 : 결제시 금액이 부족하면 결제불가 혹은 결제금액보다 크면 잔돈 출력
 */
    Scanner scanner = new Scanner(System.in);
    int num = 0 ; // 선택 버튼
    //재고 목록 : stocks
    //장바구니 : shoppings
    int[] stocks = { 10 , 10 , 10 };
    int[] shoppings = { 0 , 0 , 0 };

    while ( true ) {
      System.out.println("------------ 롯데리아 키오스크 ----------- ");
      System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ");
      System.out.print(" >>안내) 버튼 선택 : ");
      num  = scanner.nextInt();

      if( num  == 1 ){ // if s
        System.out.println("==>>안내)콜라 선택했습니다.");
        // 재고목록 --> 장바구니 목록
        // 만약에 재고가 있을경우
        if( stocks[num-1] == 0 ){ // 재고가 없으면
          System.out.println(">>안내) 구매불가 [재고가 없음.]");
        } // if end
        else{ // 재고가 있으면
          System.out.println("안내 :  장바구니 콜라 1개를 담기.");
          stocks[ num-1 ]--; // 콜라재고 1 감소
          shoppings[num-1]++; // 콜라장바구니 1증가
        }// else end
      } else if( num  == 2 ) {
        System.out.println(">>안내)환타 선택했습니다.");
        if( stocks[num-1] == 0 ){ // 재고가 없으면
          System.out.println(">>안내) 구매불가 [재고가 없음.]");
        } // if end
        else{ // 재고가 있으면
          System.out.println(">>안내)) 장바구니 환타 1개를 담기.");
          stocks[ num-1 ]--;
          shoppings[num-1]++;
        }// else end
      }
      else if( num == 3 ) {
        System.out.println(">>안내)사이다 선택했습니다.");
        if( stocks[num-1] == 0 ){ // 재고가 없으면
          System.out.println(">>안내) 구매불가 [재고가 없음.]");
        } // if end

 else{ // 재고가 있으면
          System.out.println(">>안내)) 장바구니 사이다 1개를 담기");
          stocks[ num-1 ]--; shoppings[num-1]++;
        }// else end
      }
      else if( num  == 4 ) {
        System.out.println(">>안내)결제 합니다.");
        System.out.println("------- 결제할 제품 목록 ----------");
        System.out.println("제품명\t수량\t가격");
        if( shoppings[0] != 0 )
          System.out.println("콜라\t"+shoppings[0]+"개\t\t"+(shoppings[0]*300)+"원" );
        if( shoppings[1] != 0 )
          System.out.println("환타\t"+shoppings[1]+"개\t\t"+(shoppings[1]*200)+"원" );
        if( shoppings[2] != 0 )
          System.out.println("사이타\t"+shoppings[2]+"개\t\t"+(shoppings[2]*100)+"원" );
      }
      else {
        System.out.println(">>안내)알수 없는 번호 입니다. ");
      } //end if

      System.out.println();

    } // while end
  }
}
