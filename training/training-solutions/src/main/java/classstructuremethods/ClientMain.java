package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Gergo Galat");
        client.setYear(1992);
        client.setAddress("1139 Budapest Üteg street 11/A");
        System.out.println("Name:" + client.getName() + " " + "Year of birth:" + client.getYear() + " " + "Address:" + client.getAddress());
        client.migrate("1078 Budapest Marek József steet 36");
        System.out.println("New address: " + client.getAddress());
    }
}
