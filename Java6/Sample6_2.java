package Java6;

public class Sample6_2 {
    public static void main(String[] args) {
        double sum,avg;
        double a[] = new double[3];
        a[0] = 2.3;
        a[1] = 1.1;
        a[2] = 5.9;

        sum = a[0]+a[1]+a[2];
        avg = sum / a.length;
        System.out.print(a[0]+"と"+a[1]+"と"+a[2]+"の平均は"+avg);
    }
}
