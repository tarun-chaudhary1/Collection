package Collection.Sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Student> byroll =(s1, s2) ->s1.roll -s2.roll;
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName)
                .thenComparing(Student::getRoll);
        TreeSet<Student> students=new TreeSet<>(studentComparator);
        students.add(new Student(1,"Abhay",78));
        students.add(new Student(8,"Balu",8));
        students.add(new Student(11,"Arcahna",97));
        students.add(new Student(7,"Arcahna",97));
        students.add(new Student(4,"Zurawar",99));


        System.out.println(students);




        System.out.println(students);




    }
}
