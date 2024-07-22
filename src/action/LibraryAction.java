package action;

import domain.Book;
import domain.Student;
import domain.Teacher;

public interface LibraryAction {
    void addBook(Book book);

    void addStudent(Student student);

    void addTeacher(Teacher teacher);

    void borrowedBook(int studentID, String title);

    void returnBook(String title);

    void listAllBooks();

    void listAllStudents();

    void listAllTeacher();

    void searchBookByTittle(String title);

    void searchStudentByName(String name);

    void searchTeacherByName(String name);

    void sortBooks();

    void sortStudents();

    void sortTeacher();

}
