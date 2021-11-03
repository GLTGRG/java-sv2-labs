package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Kóspallag Kör", LocalDate.of(2022, 3, 10));

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPerson(3);
        cyclingTour.registerPerson(4);
        cyclingTour.ride(30);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
