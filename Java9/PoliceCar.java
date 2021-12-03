package Java9;

public class PoliceCar extends Car {
    public PoliceCar(){
        System.out.println("PoliceCarオブジェクト生成");
    }
    public void chase(){
        System.out.println("サイレンを鳴らして追いかける");
        move();
    }
}
