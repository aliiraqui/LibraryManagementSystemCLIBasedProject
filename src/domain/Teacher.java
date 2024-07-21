package domain;

public class Teacher extends Person {

    private final int teacherID;
    private String department;

    public Teacher(String name, String emailAddress, int teacherID, String department) {
        super(name, emailAddress);
        this.teacherID = teacherID;
        this.department = department;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("~~~ Teacher ~~~" +
                "Teacher ID: " + teacherID +
                "Department: " + department);
    }
}
