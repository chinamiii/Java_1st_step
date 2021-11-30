package Java7;

public class SampleClass7_2 {

    int num = 100;
    String str = "ABC";

    int add(int a,int b){
        return a+b;
    }

    String add(String str){
        return this.str+str;
    }

    void showNum(){
        System.out.print("num="+num);
    }
}
