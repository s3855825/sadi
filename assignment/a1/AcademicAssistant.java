package assignment.a1;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademicAssistant {
    private StudentEnrolment enrolmentManager;
    private InputValidator inputValidator;

    public AcademicAssistant() {
        enrolmentManager = new StudentEnrolment();
        inputValidator = new InputValidator();
    }

    public void printEnrolmentList() {
        ArrayList<StudentEnrolment> enrolments = enrolmentManager.getAll();
        for (int i = 0; i < enrolments.size(); i++) {
            StudentEnrolment enrolment = enrolments.get(i);
            enrolment.displayRecord();
        }
    }

    public String getSemester() {
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

    public void enrol(Student newStudent, Course newCourse, String newSemester) {
        enrolmentManager.add(newStudent, newCourse, newSemester);
    }

    public void updateEnrolment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id.");
        String name = scanner.nextLine();

        if (!enrolmentManager.studentExist(name)) {
            System.out.println("Student not found.");
        } else {
            String semester = getSemester();
            courseListing(name, semester);
            System.out.println("Enter 'a' to add or 'd' to delete course from list.");
            char choice = scanner.next().charAt(0);
            while (choice != 'a' || choice != 'd') {
                System.out.println("Invalid input. Enter again");
                choice = scanner.next().charAt(0);
            }

            // TODO: implement add and update

        }
        scanner.close();
    }

    // Print all courses for 1 student in 1 semester
    public void courseListing(String name, String semester) {
        ArrayList<StudentEnrolment> enrolmentList = enrolmentManager.getAll();

        System.out.println("Showing all courses taken by " + name + " semester " + semester);

        if (!enrolmentManager.studentExist(name)) {
            System.out.println("Student is not enrolled in any course.");
        }

        for (int i = 0; i < enrolmentList.size(); i++) {
            StudentEnrolment enrolment = enrolmentList.get(i);

            if (enrolment.getStudent().getName().trim().equals(name)
                    || enrolment.getStudent().getId().trim().equals(name)) {
                if (enrolment.getSemester().trim().equals(semester)) {
                    enrolment.displayRecord();
                }
            }
        }
    }

    // Print all students in 1 course in 1 semester
    public void studentListing(String name, String semester) {
        ArrayList<StudentEnrolment> enrolmentList = enrolmentManager.getAll();

        System.out.println("Showing all students in " + name + " semester " + semester);

        if (!enrolmentManager.courseExist(name)) {
            System.out.println("Course has no student.");
        }

        for (int i = 0; i < enrolmentList.size(); i++) {
            StudentEnrolment enrolment = enrolmentList.get(i);
            if (enrolment.getCourse().getName().trim().equals(name)
                    || enrolment.getCourse().getId().trim().equals(name)) {
                if (enrolment.getSemester().trim().equals(semester)) {
                    enrolment.displayRecord();
                }
            }
        }
    }

    // Print all course in 1 semester
    public void courseInSemester(String semester) {
        ArrayList<StudentEnrolment> enrolmentList = enrolmentManager.getAll();

        System.out.println("Showing all courses offered in " + semester);

        int counter = 0;
        for (int i = 0; i < enrolmentList.size(); i++) {
            StudentEnrolment enrolment = enrolmentList.get(i);
            if (enrolment.getSemester().trim().equals(semester)) {
                enrolment.displayRecord();
                counter += 1;
            }
        }

        if (counter == 0) {
            System.out.println("No course offered this semester.");
        }
    }
}