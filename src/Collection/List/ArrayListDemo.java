package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(40);

        System.out.println(nums);
        System.out.println(nums.get(4));
        System.out.println(nums.size());
        System.out.println(nums.remove(3));
        nums.add(3,50);
        System.out.println(nums);

        Iterator<Integer> it= nums.iterator();
        while(it.hasNext()){

            int data=it.next();
            if(data==50){
                it.remove();
            }
            else{
                System.out.println(data);
            }
        }
    }
}
