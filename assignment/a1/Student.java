package assignment.a1;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private Date birthdate;

    public Student() {
    }

    public Student(String newId, String newName, Date newBirthdDate) {
        id = newId;
        name = newName;
        birthdate = newBirthdDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    void setId(String newId) {
        id = newId;
    }

    void setName(String newName) {
        name = newName;
    }

    void setBirthdate(Date newBirthdate) {
        birthdate = newBirthdate;
    }
}