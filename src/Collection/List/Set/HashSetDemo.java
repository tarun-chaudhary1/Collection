package Collection.List.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set.size());
    }
}
