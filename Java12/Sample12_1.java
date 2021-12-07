package Java12;

import java.util.*;

public class Sample12_1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //要素の追加
        al.add(new Member("竈門炭治郎", 20,01));
        al.add(new Member("竈門禰󠄀豆子", 38,02));
        al.add(new Member("煉獄杏寿郎", 23,03));
        al.add(new Member("宇髄天元", 40,04));

        //削除
        al.remove(2);

        //表示
        for(int i=0; i<al.size();i+=1){
            Member m = (Member)al.get(i);
            System.out.println("名前："+m.getName()+"年齢"+m.getAge());
        }    

    }
}
