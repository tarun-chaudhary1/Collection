package Collection.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CamparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,20,30,5,8,11,7));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Studentt> al=  new ArrayList<>();
        Studentt s1=new Studentt(11,"Tarun");
        Studentt s2=new Studentt(3,"Raj");
        Studentt s3=new Studentt(88,"Arjun");
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
