package wk2.activity2.jdbc.models;

import wk2.activity2.jdbc.core.Student;
import wk2.activity2.jdbc.core.Validate;
import wk2.activity2.jdbc.logger.ServiceLogger;

import java.util.ArrayList;

public class GetStudentResponseModel implements Validate {
    private StudentModel[] students;

    public GetStudentResponseModel() { }

    private GetStudentResponseModel(StudentModel[] students) {
        this.students = students;
    }

    public static GetStudentResponseModel buildModelFromList(ArrayList<Student> students) {
        // Jackson cannot convert complex data structures to text. It can convert arrays of objects.
        // Must convert arraylist to array.

        return new GetStudentResponseModel(null);
    }

    public StudentModel[] getStudents() {
        return students;
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
