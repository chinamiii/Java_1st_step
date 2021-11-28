package Java5;

public class Sample5_5 {
    public static void main(String[] args) {
      int i = 100;

      //whileループ
      System.out.print("whileでの実行");
      while(i==0){
          System.out.print("処理しました");
      }
      System.out.println();

      //do~whileループ
      System.out.print("do~whileでの実行→");
      do{
          System.out.print("処理しました");
      }while(i==0);
    }
}
