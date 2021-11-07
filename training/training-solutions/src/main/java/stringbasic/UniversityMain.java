package stringbasic;

public class UniversityMain {

    public static void main(String[] args) {
        Person person = new Person("Galát Gergő", "gg@gmail.com", "111222333", "11111111-22222222-3333333", "06201231212");
        Student student = new Student(person, "asdQWE", "12345");

        University university = new University();

        Person samePerson = new Person("Galát Gergő", "gg@gmail.com", "111222333", "11111111-22222222-3333333", "06201231212");
        Student sameStudent = new Student(person, "asdQWE", "12345");

        Person anotherPerson = new Person("Galát János", "gj@gmail.com", "333222111", "33333333-22222222", "06203213232");
        Student anotherStudent = new Student(person, "qweASD", "87654");

        System.out.println(university.areEqual(student,anotherStudent));
        System.out.println(university.areEqual(student, sameStudent));
    }
}
