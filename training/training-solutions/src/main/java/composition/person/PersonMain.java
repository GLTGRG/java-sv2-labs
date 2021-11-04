package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Gergp Galát","12345AB");

        System.out.println(person.personToString());

        Address address = new Address("Hungary", "Budapest", "Marek József utca 36.", "1078");
        person.moveTo(address);

        System.out.println(person.getAddress().addressToString());

        person.correctData("Gergő Galát", "12345AB");
        System.out.println(person.personToString());

        person.getAddress().correctData("Hungary", "Budapest", "Marek József utca 36. 3/34", "1078");
        System.out.println(person.getAddress().addressToString());
    }
}
