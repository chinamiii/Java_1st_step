package Java4;

public class test4 {
  public static void main(String[] args) {
    int a;
    a = 14;
    System.out.println(a);
    if (a >= 1 & a <= 13) {
      System.out.println("トランプ");
    }
    if (a >= 1 & a <= 10) {
      System.out.println("平札");
      if (a % 2 == 0) {
        System.out.println("偶数");
      } else {
        System.out.println("奇数");
      }
    }
    if (a >= 11 & a <= 13) {
      System.out.println("絵札");
      if (a % 2 == 0) {
        System.out.println("偶数");
      } else {
        System.out.println("奇数");
      }
    } else if (!(a >= 1 & a <= 13)){
      System.out.println("不適切な値");
    }
  }
}
