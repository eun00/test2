package array;

import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String foods[] =  new String[5];
    for( int i = 0 ; i < foods.length ; i++ ) {
      System.out.print((i+1)+"번째사람 메뉴 주문>");
      foods[i] =  scanner.nextLine();
      //foods[0] ~ foods[4]
    }
    //배열의 방의 개수 - 배열명.length
    for( int i = 0 ; i < foods.length ; i++ ) {
      System.out.println(foods[i] + " 하나 주문");
    }

    // 확장 for문 : for ~each 문
    /*
    * for( 타입 변수 : 배열 ){
    *     배열의 개수만큼 반복
    *     반복하면 변수각각의 값을 대입
    * }
    * */
    for( String item : foods ) {
      System.out.println("확장 for :" + item );
    }

  }
}
