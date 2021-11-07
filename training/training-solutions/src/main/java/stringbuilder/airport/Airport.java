package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Deleted flights: ");
        for (Flight f : flights){
            if (f.getStatus() == Status.DELETED){
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Airport airport = new Airport();

        Flight flight1 = new Flight("A-001", Status.ACTIVE);
        Flight flight2 = new Flight("B-001", Status.DELETED);
        Flight flight3 = new Flight("C-002", Status.ACTIVE);
        Flight flight4 = new Flight("D-003", Status.DELETED);

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);

        System.out.println(airport.getDeletedFlights());
    }
}

