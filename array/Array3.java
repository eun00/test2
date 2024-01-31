package array;

public class Array3 {
  public static void main(String[] args) {
    // 배열3 -> 각각 A코드 , B코드, C코드
    // 1차원 배열
    String[] arrA = {"A1", "A2", "A3"};
    String[] arrB = {"B1", "B2", "B3"};
    String[] arrC = {"C1", "C2", "C3"};
    System.out.println("arrA[2] :" + arrA[2] );
    System.out.println("C2? arrC[1] :" + arrC[1] );
    System.out.println("============" );

    // 2차원 배열
//    String[][] arrs = new String[][]{};
    String[][] arrs = new String[][]{
        {"A1", "A2", "A3"} ,
        {"B1", "B2", "B3"} ,
        {"C1", "C2", "C3"}
    };
    System.out.println("A2 :" + arrs[0][1] );
    System.out.println("C3 :" + arrs[2][2] );
    System.out.println("============" );
/*
 String[][] arrs = new String[][]{
        열 0    1    2
 행   0  {"A1", "A2", "A3"} ,
      1  {"B1", "B2", "B3"} ,
      2  {"C1", "C2", "C3"}
    };
* */
    // 2차원 배열 2중 for문 출력
    for( int i = 0 ; i <= 2 ; i++ ) { // [행][열] => i 행
      for( int j = 0; j <= 2 ; j++ ) { //[행][열] => j 열
        System.out.print(arrs[i][j] + " ");
      }
      System.out.println();
    }


    for( int i = 0 ; i < arrs.length ; i++ ) { // [행][열] => i 행
      for( int j = 0; j < arrs[i].length ; j++ ) { //[행][열] => j 열
        System.out.print(arrs[i][j] + " ");
      }
      System.out.println();
    }



    String[][] arrs1 = new String[][]{
        {"A1", "A2", "A3"} ,
        {"B1", "B2", "B3", "B4"} ,
        {"C1", "C2", "C3", "C4", "C5"}
    };

    System.out.println("2차원 배열 , 열의 개수 다르게 ");
    for( int i = 0 ; i < arrs1.length ; i++ ) { // [행][열] => i 행
      for( int j = 0; j < arrs1[i].length ; j++ ) { //[행][열] => j 열
        System.out.print(arrs1[i][j] + " ");
      }
      System.out.println();
    }

  }
}
