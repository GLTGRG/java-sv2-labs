package enumtype.firstenum;


import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        System.out.println(Continent.ANTARCTICA);
        System.out.println(Continent.SOUTHAMERICA);
        System.out.println(Continent.NORTHAMERICA);
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.EUROPE);
        System.out.println(Continent.OCEANIA);
        System.out.println(Arrays.toString(Continent.values()));

        for (Continent c : Continent.values()) {
            System.out.println(c);
        }

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
        System.out.println(Ocean.valueOf("ARCTIC"));

        System.out.println(Football.WIDERECEIVER.name());
        System.out.println(Football.TACKLE.name());
        System.out.println(Football.GUARD.name());
        System.out.println(Football.CENTER.name());
        System.out.println(Football.THIGHEND.name());
        System.out.println(Football.QUARTERBACK.name());
        System.out.println(Football.HALFBACK.name());

    }
}