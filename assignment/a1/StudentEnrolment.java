package assignment.a1;

import java.util.ArrayList;
import java.util.StringJoiner;

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
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(newStudent, newCourse, newSemester);
        studentEnrolments.add(newStudentEnrolment);
    }

    @Override
    public void delete(Student student, Course course, String semester) {
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(student, course, semester);
        studentEnrolments.remove(newStudentEnrolment);
    }

    @Override
    public void update(StudentEnrolment studentEnrolment, Student newStudent, Course newCourse, String newSemester) {
        StudentEnrolment newStudentEnrolment = new StudentEnrolment(newStudent, newCourse, newSemester);
        for (int i = 0; i < studentEnrolments.size(); i++) {
            if (studentEnrolments.get(i) == newStudentEnrolment) {
                studentEnrolments.set(i, newStudentEnrolment);
            }
        }
    }

    @Override
    public StudentEnrolment getOne(String studentId, String courseId, String semester) {

        StudentEnrolment enrolmentRecord = null;

        for (int i = 0; i < studentEnrolments.size(); i++) {
            enrolmentRecord = studentEnrolments.get(i);
            if (enrolmentRecord.student.getId() == studentId && enrolmentRecord.course.getId() == courseId
                    && enrolmentRecord.semester.equals(semester)) {
                return enrolmentRecord;
            }
        }

        if (enrolmentRecord == null) {
            System.out.println("Record not found.");
        }

        return enrolmentRecord;
    }

    @Override
    public ArrayList<StudentEnrolment> getAll() {

        return studentEnrolments;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public boolean studentExist(String name) {
        for (int i = 0; i < studentEnrolments.size(); i++) {
            if (studentEnrolments.get(i).student.getName().equals(name)
                    || studentEnrolments.get(i).student.getId().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean courseExist(String name) {
        for (int i = 0; i < studentEnrolments.size(); i++) {
            if (studentEnrolments.get(i).course.getName().equals(name)
                    || studentEnrolments.get(i).course.getId().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void displayRecord() {
        StringJoiner str = new StringJoiner(",");
        str.add(student.getId());
        str.add(student.getName());
        str.add(student.getBirthdate());
        str.add(course.getId());
        str.add(course.getName());
        str.add(String.valueOf(course.getNumCredit()));
        str.add(semester);
        String record = str.toString();
        System.out.println(record);
    }
}