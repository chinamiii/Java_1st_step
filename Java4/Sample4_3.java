package Java4;

public class Sample4_3 {
    public static void main(String[] args) {
      int test_result;
      test_result = 70;
      if(test_result >= 80){
          System.out.println("合格");
      }else if(test_result >= 60){
          System.out.println("準合格");
      }else if(test_result >= 30){
          System.out.println("追試");    
      }else{
          System.out.println("不合格");
      }
    }
    
}
