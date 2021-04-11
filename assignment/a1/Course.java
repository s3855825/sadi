package assignment.a1;

public class Course {
    private String id;
    private String name;
    private int numCredit;

    public Course() {
    }

    public Course(String newId, String newName, int newNumCredit) {
        id = newId;
        name = newName;
        numCredit = newNumCredit;
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