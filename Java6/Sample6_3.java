package Java6;

public class Sample6_3 {
    public static void main(String[] args) {
        int a[] = new int[100];
        int sum = 0;
        double avg;
        for(int i=0;i<a.length;i=i+1){
          a[i] = (int)(Math.random()*100)+1;
          System.out.print(a[i]+" ");
          sum = sum + a[i];
        }
        System.out.println();
        avg = sum/a.length;
        System.out.println("平均値は"+avg);
    }
}
