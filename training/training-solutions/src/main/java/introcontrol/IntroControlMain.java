package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("subtractTenIfGreaterThanTen");
        System.out.println(introControl.subtractTenIfGreaterThanTen(6));
        System.out.println(introControl.subtractTenIfGreaterThanTen(12));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));

        System.out.println("describeNumber");
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println("greetingToJoe");
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Gergő"));

        System.out.println("calculateBonus");
        System.out.println(introControl.calculateBonus(1000001));
        System.out.println(introControl.calculateBonus(99999));

        System.out.println("calculateConsumption");
        System.out.println(introControl.calculateConsumption(3352,1423));

        System.out.println("printNumbers");
        introControl.printNumbers(4);

        System.out.println("printNumberBetween");
        introControl.printNumberBetween(4, 11);

        System.out.println("printNumberBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(3,11);
        introControl.printNumbersBetweenAnyDirection(11,3);

        System.out.println("printOddNumbers");
        introControl.printOddNumbers(10);
        introControl.printOddNumbers(11);
    }
}
