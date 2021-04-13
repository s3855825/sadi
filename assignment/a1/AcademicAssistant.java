package assignment.a1;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademicAssistant {
    private StudentEnrolment enrolmentManager;

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

    // Print all courses for 1 student in 1 semester
    public void courseListing(String name, String semester) {
        ArrayList<StudentEnrolment> enrolmentList = enrolmentManager.getAll();

        if (!enrolmentManager.courseExist(name)) {
            System.out.println("Student is not enrolled in any course.");
        }

        for (int i = 0; i < enrolmentList.size(); i++) {
            StudentEnrolment enrolment = enrolmentList.get(i);
            if (enrolment.getStudent().getName().equals(name) || enrolment.getStudent().getId().equals(name)) {
                if (enrolment.getSemester().equals(semester)) {
                    enrolment.displayRecord();
                }
            }
        }
    }

    // Print all students in 1 course in 1 semester
    public void studentListing(String name, String semester) {
        ArrayList<StudentEnrolment> enrolmentList = enrolmentManager.getAll();

        if (!enrolmentManager.studentExist(name)) {
            System.out.println("Student is not enrolled in any course.");
        }

        for (int i = 0; i < enrolmentList.size(); i++) {
            StudentEnrolment enrolment = enrolmentList.get(i);
            if (enrolment.getCourse().getName().equals(name) || enrolment.getCourse().getId().equals(name)) {
                if (enrolment.getSemester().equals(semester)) {
                    enrolment.displayRecord();
                }
            }
        }
    }
}