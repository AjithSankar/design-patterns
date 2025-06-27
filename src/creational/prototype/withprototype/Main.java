package creational.prototype.withprototype;

public class Main {

    public static void main(String[] args) {

        Student obj = new Student("Ajith", 10, 28);
        Student cloneObj = (Student) obj.clone();

        System.out.println(obj);
        System.out.println(cloneObj);

    }
}
