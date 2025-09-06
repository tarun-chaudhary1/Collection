package Collection.Sorting;

public  class Studentt implements Comparable<Studentt>{
    int id;
    String name;

    public Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Studentt o) {
        return this.id-o.id;
    }
}
