package Collection.List;

import java.util.ArrayList;
import java.util.List;

class Student{

    int id;

    String name;

    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

public class CustomList {

    public static void main(String[] args) {

        Student s1= new Student(1,"Tarun","Java");
        Student s2= new Student(2,"Arjun","DSA");
        Student s3= new Student(3,"Karan","DevOps");

        List<Student> studentList= new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);
    }
}
