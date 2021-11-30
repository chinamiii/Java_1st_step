package Java7;

public class Sample7_2 {
    public static void main(String[] args) {
        SampleClass7_2 o = new SampleClass7_2();
        o.num = 1;
        o.str = "AAA";
        String str = o.add("BBB");
        System.out.println(str);
        o.showNum();
    }
}
