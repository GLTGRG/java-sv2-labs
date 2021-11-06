package enumtype.solarsystem;

public enum SolarSystem {
    EARTH(1), JUPITER(79), MARS(2), NEPTUNE(14), SATURN(82), URANUS(27), VENUS(0), MERCURY(0);

    private int moon;

    SolarSystem(int moon) {
        this.moon = moon;
    }

    public int getMoon() {
        return moon;
    }
}
