package domain;

import java.util.*;

public class Student extends Person {
    private final int studentID;
    private int grade;
    private List<Book> borrowedBooks;
    private double totalFineDue;

    public Student(String name, String emailAddress, int studentID, int grade) {
        super(name, emailAddress);
        this.studentID = studentID;
        this.grade = grade;
        this.borrowedBooks = new ArrayList<>();
        this.totalFineDue = 0.0;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public double getTotalFineDue() {
        return totalFineDue;
    }

    public void setTotalFineDue(double totalFineDue) {
        this.totalFineDue = totalFineDue;
    }

    public void display() {
        System.out.println("~~~ Student ~~~" +
                "Student ID: " + studentID +
                "Grade: " + grade +
                "Borrowed Books: " + borrowedBooks +
                "Total Fine Due: " + totalFineDue);
    }
}
