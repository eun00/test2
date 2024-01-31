package loopcon;

public class For1 {
  public static void main(String[] args) {
    for( int i = 0 ; i <= 2 ; i++ ) {
      System.out.println("===== 이중 for문 ====");
      for( int j = 0 ; j <= 2 ; j++ ) {
        System.out.print("i = "+ i +" / j = "+ j+" , ");
      }
      System.out.println();
    }//for i
  } // end main
}// end class


/*
  for 2중 : 변수 사용자정의 
  i, j , k.. 
  a, x, ?
  
  for( 초기값 ; 조건식 ; 증감식 ){
    for( 초기값 ; 조건식 ; 증감식 ){
      실행문
    }
  }

   for( 초기값 ; 조건식 ; 증감식 ){
    실행문
    for( 초기값 ; 조건식 ; 증감식 ){
      실행문
    }
     실행문
  }

  for( int i = 0 ; i <= 2  ; i++ ){  // 행
    for( int j = 0 ; j <= 2 ; j++ ){ // 열
      실행문
    }
  }
            열(j)
  행(i) 0 :  0    1    2
  행(i) 1 :  0    1    2
  행(i) 2 :  0    1    2

실행 순서
for( 0 ; 1,12  ; 11 ){  // 행
    for( 2,13 ; 3,6,9 ; 5,8 ){ // 열
      4 실행문7
    }
    10 j for문 벗어남
  }


  행      열
  i = 0 , j =0
  i = 0 , j =1
  i = 0 , j =2

  i = 1 , j =0
  i = 1 , j =1
  i = 1 , j =2

  i = 2 , j =0
  i = 2 , j =1
  i = 2 , j =2
* */
