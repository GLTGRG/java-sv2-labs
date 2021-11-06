package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {
        Cpu cpu = new Cpu("i7-6900k", 4.6);
        PersonalComputer personalComputer = new PersonalComputer(cpu);

        personalComputer.addHardware(new Hardware("monitor", "Acer"));
        personalComputer.addHardware(new Hardware("keyboard", "Royal Kludge"));
        personalComputer.addSoftware(new Software("IntelliJ IDEA", 2021.2));
        personalComputer.addSoftware(new Software("Spotify", 8.6) );

        System.out.println(personalComputer.getCou());
        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftware());

        System.out.println(personalComputer);
    }
}
