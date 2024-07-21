package domain;

public class Book extends AbstractEntity implements Comparable<Book> {

    private final String title;
    private final String author;
    private final String publisher;
    private final String genre;
    private final String language;
    private final int numberOfPage;
    private boolean isAvailable;
    private String borrowerName;

    public Book(String title, String author, String publisher, String genre, String language, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.language = language;
        this.numberOfPage = numberOfPage;
        this.borrowerName = null;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    @Override
    public void display() {
        System.out.println("~~~ Book ~~~" +
                "Title: " + title +
                "Author: " + author +
                "Publisher: " + publisher +
                "Genre: " + genre +
                "Language: " + language +
                "Number Of Page: " + numberOfPage +
                "Is Available? " + isAvailable +
                "Borrower Name: " + borrowerName);
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
