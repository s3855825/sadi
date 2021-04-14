package assignment.a1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static public void main(String args[]) throws FileNotFoundException {
        // populate from csv
        AcademicAssistant academicAssistant = new AcademicAssistant();

        try {
            Scanner scanner = new Scanner(new File("default.csv"));
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] lineContent = line.split(",");
                Student newStudent = new Student(lineContent[0], lineContent[1], lineContent[2]);
                Course newCourse = new Course(lineContent[3], lineContent[4], lineContent[5]);
                String semester = lineContent[6];
                academicAssistant.enrol(newStudent, newCourse, semester);
            }

            // academicAssistant.printEnrolmentList();
            // academicAssistant.courseInSemester("2020C");
            academicAssistant.courseListing("Alex Miker", "2020C");
            // academicAssistant.studentListing("BUS2232", "2020C");

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(".csv file not found.");
        }
    }
}
