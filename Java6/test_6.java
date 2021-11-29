package Java6;

public class test_6 {
    public static void main(String[] args) {
      int a[] = new int [10];
      int max = a[0];
      int min = a[0];

      for(int i=0;i<a.length;i=i+1){
        a[i] = (int)(Math.random()*100)+1;
        System.out.println(a[i]);
      }
      System.out.println(max);
      for(int i=0;i<a.length;i=i+1){
        if(max < a[i]){
          max = a[i];
        }
        if(min > a[i]){
          min = a[i];
        }
      }
      System.out.println("最大値"+max);
      System.out.println("最小値"+min);

    }
}
