package assignment.a1;

import java.util.Scanner;

public class AcademicAssistant {
    private StudentEnrolmentManager enrolmentManager;

    public AcademicAssistant() {
        enrolmentManager = new StudentEnrolment();
    }

    public String getSemester() {
        InputValidator inputValidator = new InputValidator();
        Scanner scanner = new Scanner(System.in);
        String semester = scanner.nextLine();
        while (!inputValidator.isValidPattern(semester, 1)) {
            System.out.println("Invalid semester pattern. Enter again");
            semester = scanner.nextLine();
        }
        scanner.close();
        return semester;
    }

    public void enrol() {
        Student newStudent = new Student();
        Course newCourse = new Course();
        String newSemester = getSemester();
        enrolmentManager.add(newStudent, newCourse, newSemester);
    }

    public void updateEnrolment() {
    }

    public void courseListing() {
    }
}