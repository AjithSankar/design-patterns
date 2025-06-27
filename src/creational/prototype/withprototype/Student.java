package creational.prototype.withprototype;

public class Student implements Prototype {
    String name;
    private int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public Prototype clone() {
        return new Student(name, id, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
