package Java6;

public class Sample6_4 {
    public static void main(String[] args) {
        double sum,avg;
        double a[] = {2.3,1.1,5.9};
        sum = a[0]+a[1]+a[2];
        avg = sum / a.length;
        System.out.print(a[0]+"と"+a[1]+"と"+a[2]+"の平均は"+avg);
    }
}
