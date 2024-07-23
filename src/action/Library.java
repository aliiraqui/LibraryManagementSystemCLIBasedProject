package action;

import domain.Book;
import domain.Student;
import domain.Teacher;

import java.util.*;

public class Library implements LibraryAction {

    private final List<Book> books;

    private final Map<Integer, Student> students;
    private final Map<Integer, Teacher> teachers;
    private final Map<String, Book> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        students = new HashMap<>();
        teachers = new HashMap<>();
        borrowedBooks = new HashMap<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
        System.out.println("Student Added: " + student.getName());
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getTeacherID(), teacher);
        System.out.println("Teacher Added: " + teacher.getName());
    }

    @Override
    public void issueBook(int studentID, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIsAvailable()) {
                Student student = students.get(studentID);
                if (student != null) {
                    book.setIsAvailable(false);
                    borrowedBooks.put(title, book);
                    student.setBorrowedBooks((List<Book>) book);
                }
            }
        }
    }

    @Override
    public void returnBook(String title) {

    }

    @Override
    public void listAllBooks() {
        System.out.println("~~~ Listing All Books ~~~");
        for (Book book : books) {
            book.display();
        }
    }

    @Override
    public void listAllStudents() {
        System.out.println("~~~ Listing All Students ~~~");
        for (Student student : students.values()) {
            student.display();
        }
    }

    @Override
    public void listAllTeacher() {
        System.out.println("~~~ Listing All Teachers ~~~");
        for (Teacher teacher : teachers.values()) {
            teacher.display();
        }
    }

    @Override
    public void listAllBorrowedBooks() {
        System.out.println("~~~ Listing All the Borrowed Books ~~~");
        for (Book book : borrowedBooks.values()) {
            book.display();
        }
    }

    @Override
    public void searchBookByTittle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("~~~ Book Found ~~~");
                book.display();
                return;
            }
        }
    }

    @Override
    public void searchStudentByName(String name) {
        for (Student student : students.values()) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("~~~ Student Found ~~~");
                student.display();
                return;
            }
        }
    }

    @Override
    public void searchTeacherByName(String name) {
        for (Teacher teacher : teachers.values()) {
            if (teacher.getName().equalsIgnoreCase(name)) {
                System.out.println("~~~ Student Found ~~~");
                teacher.display();
                return;
            }
        }
    }

    @Override
    public void sortBooks() {
        Collections.sort(books);
    }

    @Override
    public void sortStudents() {
        List<Student> studentList = new ArrayList<>(students.values());
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("~~~ Student's List Sorted ~~~");
        for (Student student : studentList) {
            student.display();
        }
    }

    @Override
    public void sortTeacher() {
        List<Teacher> teacherList = new ArrayList<>(teachers.values());
        teacherList.sort(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("~~~ Teacher's List Sorted ~~~");
        for (Teacher teacher : teacherList) {
            teacher.display();
        }
    }
}
