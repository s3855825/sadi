package assignment.a1;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String birthdate;
    private InputValidator inputValidator;

    public Student(String newId, String newName, String newBirthdate) {
        id = newId;
        name = newName;
        birthdate = newBirthdate;
    }

    public Student() {
        String dob;
        inputValidator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's information");
        System.out.println("Enter student name: ");
        name = scanner.nextLine();

        System.out.println("Enter student id: ");
        id = scanner.nextLine();
        while (!inputValidator.isValidPattern(id, 0)) {
            System.out.println("Invalid id pattern. Enter again.");
            id = scanner.nextLine();
        }

        System.out.println("Enter student dob (MM/dd/yyyy): ");
        dob = scanner.nextLine();
        while (!inputValidator.isValidPattern(dob, 2)) {
            System.out.println("Invalid date pattern. Enter again.");
            dob = scanner.nextLine();
        }
        scanner.close();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    void setId(String newId) {
        id = newId;
    }

    void setName(String newName) {
        name = newName;
    }

    void setBirthdate(String newBirthdate) {
        birthdate = newBirthdate;
    }
}