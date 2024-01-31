package loopcon;

public class For4 {
  public static void main(String[] args) {
    int result =0 ;
    for( int i = 2 ; i <= 9 ; i++ ) {
      System.out.println("====" + i + "단 ====");
      for( int j = 1 ; j <= 9 ; j++ ) {
        result = i * j ;
        System.out.println(i + " X " + j + " = " + result );
      } // for j
      System.out.println();
      System.out.println();
    } // for i
  }
}

/*
* ==== 2단 ====
* 2 X 1 = 2
* ...
* 2 X 9 = 18
* ...
* ==== 9단 ====
 * 9 X 1 = 9
 * ...
 * 9 X 9 = 81
* */