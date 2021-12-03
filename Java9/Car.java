package Java9;

public class Car {
    private int fuel = 10;
    private int migration = 0;
    public Car(){
        System.out.println("Carオブジェクト生成");
    }
    public void move(){
        if(fuel >=1){
            fuel = fuel - 1;
            migration = migration + 1;
        }
        System.out.println("移動距離="+ migration + "残り燃料" + fuel);
    }
}
