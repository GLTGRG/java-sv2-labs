package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(12.2345, true);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int distanceInInteger = (int)distance.getDistanceInKm();
        System.out.println(distanceInInteger);
    }
}
