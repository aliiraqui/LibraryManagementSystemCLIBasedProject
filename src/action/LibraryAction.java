package action;

import domain.Book;
import domain.Student;

public interface LibraryAction {
    void addBook(Book book);

    void addStudent(Student student);

    void borrowedBook(int studentID, String title);

    void returnBook(String title);

    void listAllBooks();

    void listAllStudents();

    void searchBookByTittle(String title);

    void sortBooks();

    void sortStudents();

}
