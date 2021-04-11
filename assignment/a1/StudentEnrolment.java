package assignment.a1;

public class StudentEnrolment implements StudentEnrolmentManager {
    private Student student;
    private Course course;
    private String semester;

    public StudentEnrolment() {
    }

    public StudentEnrolment(Student newStudent, Course newCourse, String newSemester) {
        student = newStudent;
        course = newCourse;
        semester = newSemester;
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

    public void setStudent(Student newStudent) {
        student = newStudent;
    }

    public void setCourse(Course newCourse) {
        course = newCourse;
    }

    public void setSemester(String newSemester) {
        semester = newSemester;
    }

    @Override
    public void add(StudentEnrolment newStudentEnrolment) {
        // TODO Auto-generated method stub
    }

    @Override
    public void add(Student newStudent, Course newCourse, String newSemester) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(StudentEnrolment StudentEnrolment) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Student student, Course course, String semester) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(StudentEnrolment studentEnrolment, Student newStudent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(StudentEnrolment studentEnrolment, Course newCourse) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(StudentEnrolment studentEnrolment, StudentEnrolment newStudentEnrolment) {
        // TODO Auto-generated method stub

    }

    @Override
    public StudentEnrolment getOne(String studentId, String courseId, String semester) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentEnrolment getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}