package stringbuilder.airport;

public class Flight {

    private String flightNumber;
    private Status Status;

    public Flight(String flightNumber, stringbuilder.airport.Status status) {
        this.flightNumber = flightNumber;
        Status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public stringbuilder.airport.Status getStatus() {
        return Status;
    }

    public void setStatus(stringbuilder.airport.Status status) {
        Status = status;
    }
}
