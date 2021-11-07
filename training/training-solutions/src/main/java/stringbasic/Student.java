package stringbasic;

public class Student {

    private Person person;
    private String neptuneCode;
    private String educationalIdentifier;
    private String accessCardNumber;

    public Student(Person person, String neptuneCode, String educationalIdentifier) {
        this.person = person;
        this.neptuneCode = neptuneCode;
        this.educationalIdentifier = educationalIdentifier;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptuneCode() {
        return neptuneCode;
    }

    public void setNeptuneCode(String neptuneCode) {
        this.neptuneCode = neptuneCode;
    }

    public String getEducationalIdentifier() {
        return educationalIdentifier;
    }

    public void setEducationalIdentifier(String educationalIdentifier) {
        this.educationalIdentifier = educationalIdentifier;
    }

    public String getAccessCardNumber() {
        return accessCardNumber;
    }

    public void setAccessCardNumber(String accessCardNumber) {
        this.accessCardNumber = accessCardNumber;
    }
}
