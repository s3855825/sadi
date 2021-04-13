package assignment.a1;

import java.util.Scanner;

public class Course {
    private String id;
    private String name;
    private int numCredit;

    public Course() {
        InputValidator inputValidator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's information");
        System.out.println("Enter course name: ");
        name = scanner.nextLine();

        System.out.println("Enter course id: ");
        id = scanner.nextLine();
        while (!inputValidator.isValidPattern(id, 3)) {
            System.out.println("Invalid id pattern. Enter again.");
            id = scanner.nextLine();
        }

        System.out.println("Enter number of credit: ");
        numCredit = scanner.nextInt();

        scanner.close();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumCredit() {
        return numCredit;
    }

    void setId(String newId) {
        id = newId;
    }

    void setName(String newName) {
        name = newName;
    }

    void setNumCredit(int newNumCredit) {
        numCredit = newNumCredit;
    }
}