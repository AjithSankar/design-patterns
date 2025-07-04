package creational.builder;

import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = List.of("Computer Networks", "OS", "DSA");
        this.subjects = subjects;
        return this;
    }
}
