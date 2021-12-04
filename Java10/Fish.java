package Java10;

public abstract class Fish {
    private String name;
    Fish(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    abstract void characteristic();
}
