package Java6;

public class Sample6_5 {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        int m,n;
        for(m = 0;m<a.length;m=m+1){
            for(n = 0;n<a[m].length;n=n+1){
              a[m][n] = m+n;
              System.out.print("a["+m+"]["+n+"]="+a[m][n]);
            }
            System.out.println();
        }
    }
}
