package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("DSA","Java","Python","DevOps"));

        ListIterator<String> lt= list.listIterator();

        System.out.println("Forward dir");

        while(lt.hasNext()){

            String data= lt.next();
            System.out.println(data);
            if(data.equals("Python")){
                lt.set("React");
            }

        }
        System.out.println("Backward dir ");

        while(lt.hasPrevious()){
            String data=lt.previous();

            System.out.println(data);
        }
        System.out.println(list);
    }
}
