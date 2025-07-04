package creational.builder;

import java.util.List;

public class MbaStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = List.of("Business Studies", "Operation Management");
        this.subjects = subjects;
        return this;
    }
}
