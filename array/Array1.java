package array;

public class Array1 {
  public static void main(String[] args) {
    //음식 주문 - 문자열
    // 배열선언  : 타입이 동일한 연속공간 선언

   // String foods[] =  new String[5];
   // String[] foods = new String[]{};

//    String[] foods = new String[]{"라면","우동","불고기","라멘","김치우동"};
    String[] foods = {"라면","우동","불고기","라멘","김치우동"};
                                  // 값이 간단하면 초기화
    //배열의 방의 개수 - 배열명.length
    for( int i = 0 ; i < foods.length ; i++ ) {
      System.out.println(foods[i] + " 하나 주문");
    }

    // 다른 자료형
    int[] x = new int[3];
    x[0] = 10;
    x[1] = 10;
    x[2] = 10;

    double[] d = new double[] {10.2,11.6,20.33};
    boolean[] b = {true, false, true };


  }
}



/*
* 변수로 처리할 경우
* String food1 = "라면";
    String food2 = "우동";
    String food3 = "불고기";
    String food4 = "라멘";
    String food5 = "김치우동";

    System.out.println( food1 + " 하나 주문");
    System.out.println( food2 + " 하나 주문");
    System.out.println( food3 + " 하나 주문");
    System.out.println( food4 + " 하나 주문");
    System.out.println( food5 + " 하나 주문");
    System.out.println( "하겠습니다. 주문완료");

    단 주문자가 30일때 ?
    *
    *
    Step2
    *
    * //음식 주문 - 문자열
    // 배열선언  : 타입이 동일한 연속공간 선언
   // String[] foods = new String[5];
    String foods[] =  new String[5];

    foods[0] = "라면"; // [인덱스] 0부터
    foods[1] = "우동";
    foods[2] = "불고기";
    foods[3] = "라멘";
    foods[4] = "김치우동";

    System.out.println( foods[0] + " 하나 주문");
    System.out.println( foods[1] + " 하나 주문");
    System.out.println( foods[2] + " 하나 주문");
    System.out.println( foods[3] + " 하나 주문");
    System.out.println( foods[4] + " 하나 주문");
    System.out.println( "하겠습니다. 주문완료");

* Step3
*  String foods[] =  new String[5];

    foods[0] = "라면"; // [인덱스] 0부터
    foods[1] = "우동";
    foods[2] = "불고기";
    foods[3] = "라멘";
    foods[4] = "김치우동";

    for( int i = 0 ; i < 5 ; i++ ) {
      System.out.println(foods[i] + " 하나 주문");
    }

    //배열의 방의 개수 - 배열명.length
    for( int i = 0 ; i < foods.length ; i++ ) {
      System.out.println(foods[i] + " 하나 주문");
    }

*
*
* */