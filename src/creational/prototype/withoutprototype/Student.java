package creational.prototype.withoutprototype;

class Student {
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
}
