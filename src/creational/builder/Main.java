package creational.builder;

public class Main {

    public static void main(String[] args) {

        StudentBuilder mbaStudentBuilder = new MbaStudentBuilder();
        StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();

        Director director1 = new Director(mbaStudentBuilder);
        Director director2 = new Director(engineeringStudentBuilder);

        Student mbaStudent = director1.createStudent();
        Student engineeringStudent = director2.createStudent();

        System.out.println(mbaStudent.toString());
        System.out.println(engineeringStudent.toString());


    }
}
