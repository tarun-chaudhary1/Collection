package Collection.List.Set;

import java.util.*;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> set= new java.util.LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(40);
        set.add(30);
        System.out.println(set);

    }
}
