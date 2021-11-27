package Java5;

public class Sample5_2 {
    public static void main(String[] args) {
        for(int i=1;i<=2;i=i+1){
          for(int j=1;j<=3;j=j+1){
            int k = i+j;
            System.out.println("i("+i+")"+"+j("+j+")=k("+k+")");
          }
        }
    }
}
