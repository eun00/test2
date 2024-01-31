package loopcon;

public class For3 {
  public static void main(String[] args) {
    //별찍기
    for( int i = 0 ; i < 5 ; i++ ) {
      for( int j = 0 ; j < (5 - i)  ; j++ ) {
        System.out.print(" * ");
      }// for j
      System.out.println();
    }// for i
  }
}

/*
 //별찍기
    for( int i = 0 ; i < 5 ; i++ ) {
      for( int j = 0 ; j < 5 ; j++ ) {
        System.out.print(" * ");
      }// for j
      System.out.println();
    }// for i

    ///////////

    //별찍기
    for( int i = 0 ; i < 5 ; i++ ) {
      for( int j = 0 ; j <= i ; j++ ) {
        System.out.print(" * ");
      }// for j
      System.out.println();
    }// for i


* */
