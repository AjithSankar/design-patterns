package creational.builder;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            System.out.println("Creating Engineering Student...");
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MbaStudentBuilder) {
            System.out.println("Creating MBA Student...");
            return createMbaStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setName("Ajith").setAge(28).setSubjects().build();
    }

    private Student createMbaStudent() {
        return studentBuilder.setRollNumber(2).setName("AK").setAge(20).setSubjects().build();
    }
}
