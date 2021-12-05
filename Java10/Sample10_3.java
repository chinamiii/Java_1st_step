package Java10;

public class Sample10_3 {
    public static void main(String[] args) {
        Fish f[] = new Fish[2];
        f[0] = new Shark2();
        f[1] = new Tuna2();
        for(int i=0; i < f.length; i+=1){
            System.out.print(f[i].getName()+" ");
            f[i].characteristic();
        }
    }
}
