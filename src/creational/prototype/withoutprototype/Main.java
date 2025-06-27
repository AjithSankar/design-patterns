package creational.prototype.withoutprototype;

public class Main {

    public static void main(String[] args) {
        Student obj = new Student("Ajith", 1, 28);

        // Client is creating the clone object
        Student cloneObj = new Student();
        cloneObj.name = obj.name;
        cloneObj.age = obj.age;

        System.out.println();

    }
}
