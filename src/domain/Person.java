package domain;

public class Person extends AbstractEntity {

    private String name;
    private String emailAddress;

    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void display() {
        System.out.println("~~~ Person ~~~" +
                "Name: " + name +
                "Email Address: " + emailAddress);
    }
}
