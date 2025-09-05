package Collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list= new Vector<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        Enumeration<Integer> e= list.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
