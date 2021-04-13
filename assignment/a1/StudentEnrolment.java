package assignment.a1;

import java.util.ArrayList;

public class StudentEnrolment implements StudentEnrolmentManager {
    private Student student;
    private Course course;
    private String semester;

    private static ArrayList<StudentEnrolment> studentEnrolments = new ArrayList<StudentEnrolment>();

    public StudentEnrolment() {
    }

    public StudentEnrolment(Student newStudent, Course newCourse, String newSemester) {
        student = newStudent;
        course = newCourse;
        semester = newSemester;
    }

    @Override
    public void add(Student newStudent, Course newCourse, String newSemester) {
        // TODO Auto-generated method stub
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(newStudent, newCourse, newSemester);
        studentEnrolments.add(newStudentEnrolment);
    }

    @Override
    public void delete(Student student, Course course, String semester) {
        // TODO Auto-generated method stub
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(student, course, semester);
        studentEnrolments.remove(newStudentEnrolment);
    }

    @Override
    public void update(StudentEnrolment studentEnrolment, Student newStudent, Course newCourse, String newSemester) {
        // TODO Auto-generated method stub
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(newStudent, newCourse, newSemester);
        for (int i = 0; i < studentEnrolments.size(); i++) {
            if (studentEnrolments.get(i) == newStudentEnrolment) {
                studentEnrolments.set(i, newStudentEnrolment);
            }
        }
    }

    @Override
    public StudentEnrolment getOne(String studentId, String courseId, String semester) {
        // TODO Auto-generated method stub
        try {
            for (int i = 0; i < studentEnrolments.size(); i++) {
                StudentEnrolment enrolmentRecord = studentEnrolments.get(i);
                if (enrolmentRecord.student.getId() == studentId && enrolmentRecord.course.getId() == courseId
                        && enrolmentRecord.semester.equals(semester)) {
                    return enrolmentRecord;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new RecordNotFoundException();
        }
    }

    @Override
    public ArrayList<StudentEnrolment> getAll() {
        // TODO Auto-generated method stub
        return studentEnrolments;
    }
}