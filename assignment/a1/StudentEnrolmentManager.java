package assignment.a1;

import java.util.ArrayList;

public interface StudentEnrolmentManager {

    public void add(Student newStudent, Course newCourse, String semester);

    public void delete(Student student, Course course, String semester);

    public void update(StudentEnrolment studentEnrolment, Student newStudent, Course newCourse, String newSemsString);

    public StudentEnrolment getOne(String studentId, String courseId, String semester);

    public ArrayList<StudentEnrolment> getAll();
}