package Collection.Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",null);
        map.put(null,6);
        System.out.println(map.get("Five"));
        System.out.println(map);

        for(String data: map.keySet()){
            System.out.println(data);
            System.out.println(map.get(data));
        }
    }
}
