package loopcon;

public class For2 {
  public static void main(String[] args) {
    // dan , result
    // 단 키보드 입력받기
    int dan = 2, result = 0;
    for( int i = 1 ; i <= 9 ; i++ ) {
      result = dan * i;
      System.out.println(dan + " X " + i + " = " + result );
    }
  }
}

/*
2단
2 X 1 = 2
2 X 2 = 4
...
2 X 9 = 18
* */