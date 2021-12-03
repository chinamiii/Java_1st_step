package Java8;

public class Sample8_4 {
    public static void main(String[] args) {
        System.out.println("クラスフィールドの利用"+SampleClass8_4.num);
        SampleClass8_4.num = 30;
        System.out.println("クラスメソッドの利用"+SampleClass8_4.getNum());
    }
}
