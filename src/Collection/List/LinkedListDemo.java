package Collection.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("Ram");
        list.add("Lakhan");
        list.add("Karan");
        list.add("Shayaam");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.getLast());
    }
}
