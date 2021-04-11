package assignment.a1;

import java.util.ArrayList;

public interface StudentEnrolmentManager {
    ArrayList<StudentEnrolment> studentEnrolments = new ArrayList<StudentEnrolment>();

    public void add(StudentEnrolment newStudentEnrolment);

    public void add(Student newStudent, Course newCourse, String semester);

    public void delete(StudentEnrolment StudentEnrolment);

    public void delete(Student student, Course course, String semester);

    public void update(StudentEnrolment studentEnrolment, Student newStudent);

    public void update(StudentEnrolment studentEnrolment, Course newCourse);

    public void update(StudentEnrolment studentEnrolment, StudentEnrolment newStudentEnrolment);

    public StudentEnrolment getOne(String studentId, String courseId, String semester);

    public StudentEnrolment getAll();
}