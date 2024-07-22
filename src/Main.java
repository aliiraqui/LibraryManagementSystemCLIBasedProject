import action.Library;
import domain.Book;
import domain.Student;
import domain.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner obj = new Scanner(System.in);
        int choice;
        do {
            System.out.println("~~~ Welcome to Ali's Library Management System (AliLibra) ~~~");
            System.out.println("Press 1 to Add New Book");
            System.out.println("Press 2 to Add New Student");
            System.out.println("Press 3 to Add New Teacher");
            System.out.println("Press 4 to Issue a Book to a Student");
            System.out.println("Press 5 to Return a Book");
            System.out.println("Press 6 to List All the Books that are there in the Library");
            System.out.println("Press 7 to List All Registered Students");
            System.out.println("Press 8 to List All Registered Teachers");
            System.out.println("Press 9 to Search a Book by Title");
            System.out.println("Press 10 to Search a Student by Name");
            System.out.println("Press 11 to Search a Teacher by Name");
            System.out.println("Press 12 to Sort the Books by Title");
            System.out.println("Press 13 to Sort Students by Name");
            System.out.println("Press 14 to Sort Teachers by Name");
            System.out.println("Press 0 to Exit");
            System.out.println("Enter your Choice: ");
            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("~~~ Adding new Book ~~~");

                    System.out.println("Enter the Book Title: ");
                    String title = obj.next();

                    System.out.println("Enter the Book Author: ");
                    String author = obj.next();

                    System.out.println("Enter the Book Publisher: ");
                    String publisher = obj.next();

                    System.out.println("Enter the Book Genre: ");
                    String genre = obj.next();

                    System.out.println("Enter the Book Language: ");
                    String language = obj.next();

                    System.out.println("Enter the Number of Pages in the Book: ");
                    int numberOfPages = obj.nextInt();

                    library.addBook(new Book(title, author, publisher, genre, language, numberOfPages));
                    break;

                case 2:
                    System.out.println("~~~ Adding new Student ~~~");

                    System.out.println("Enter Student's Name: ");
                    String studentName = obj.next();

                    System.out.println("Enter Student's Email Address: ");
                    String studentEmailAddress = obj.next();

                    System.out.println("Enter Student ID: ");
                    int studentID = obj.nextInt();

                    System.out.println("Enter Student's Grade: ");
                    int grade = obj.nextInt();

                    library.addStudent(new Student(studentName, studentEmailAddress, studentID, grade));
                    break;

                case 3:
                    System.out.println("~~~ Adding New Teacher ~~~");

                    System.out.println("Enter Teacher's Name: ");
                    String teacherName = obj.next();

                    System.out.println("Enter Teacher's Email Address: ");
                    String teacherEmailAddress = obj.next();

                    System.out.println("Enter Teacher ID: ");
                    int teacherID = obj.nextInt();

                    System.out.println("Enter Teacher's Department: ");
                    String department = obj.next();

                    library.addTeacher(new Teacher(teacherName, teacherEmailAddress, teacherID, department));
                    break;

                case 4:
                    System.out.println("Enter Student ID: ");
                    int stuID = obj.nextInt();

                    System.out.println("Enter the book title that will be issued: ");
                    String bookTitle = obj.next();

                    library.issueBook(stuID, bookTitle);
                    break;

                case 5:
                    System.out.println("Enter the Book Title to Return: ");
                    String returnBookTitle = obj.next();

                    library.returnBook(returnBookTitle);
                    break;

                case 6:
                    library.listAllBooks();
                    break;

                case 7:
                    library.listAllStudents();
                    break;

                case 8:
                    library.listAllTeacher();
                    break;

                case 9:
                    System.out.println("Enter the Book Title to Search: ");
                    String searchBookTitle = obj.next();

                    library.searchBookByTittle(searchBookTitle);
                    break;

                case 10:
                    System.out.println("Enter the Student Name to Search: ");
                    String searchStudentName = obj.next();

                    library.searchStudentByName(searchStudentName);
                    break;

                case 11:
                    System.out.println("Enter the Teacher Name to Search: ");
                    String searchTeacherName = obj.next();

                    library.searchTeacherByName(searchTeacherName);
                    break;

                case 12:
                    library.sortBooks();
                    break;

                case 13:
                    library.sortStudents();
                    break;

                case 14:
                    library.sortTeacher();
                    break;
            }

        } while (choice != 0);
    }
}