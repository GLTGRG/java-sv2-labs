package intromethods.registration;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "Name: " + name + "\n" + "Date of Birth: " + dateOfBirth + "\n" + "E-mail: " + email;
    }
}
