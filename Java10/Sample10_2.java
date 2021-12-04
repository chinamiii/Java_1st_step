package Java10;

public class Sample10_2 {
    public static void main(String[] args) {
        Shark2 s = new Shark2();
        Tuna2 t = new Tuna2();
        System.out.print(s.getName()+" ");
        s.characteristic();
        System.out.print(t.getName()+" ");
        t.characteristic();
    }
}
