package assignment.a1;

import java.util.regex.Pattern;

public class InputValidator {
    private String studentIdPattern = "[s]+\\d{7}";
    private String semesterPattern = "[2]\\d{3}[ABC]";
    private String dateFormat = "(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/(19|20)[0-9][0-9]";
    private String courseIdPattern = "[A-Z]{3,4}\\d{4}";

    public boolean isValidPattern(String input, int type) {
        if (type == 0) {
            Pattern matchPattern = Pattern.compile(studentIdPattern);
            return matchPattern.matcher(input).matches();
        } else if (type == 1) {
            Pattern matchPattern = Pattern.compile(semesterPattern);
            return matchPattern.matcher(input).matches();
        } else if (type == 2) {
            Pattern matchPattern = Pattern.compile(dateFormat);
            return matchPattern.matcher(input).matches();
        } else {
            Pattern matchPattern = Pattern.compile(courseIdPattern);
            return matchPattern.matcher(input).matches();
        }
    }
}