package Java4;

public class Sample4_5 {
    public static void main(String[] args) {
        int math_grades;
        math_grades = 9;
        switch(math_grades){
          case 1:
              System.out.println("悪");
              break;
          case 2:
              System.out.println("普通");
              break;
          case 3:
              System.out.println("良");
              break;
          default:
              System.out.print("成績が不適切です");            
        }
    }
}
