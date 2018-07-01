package w9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BoardManagement extends BoardOfFlights {

    private List<Flight> flightList = super.getFlightList();
    private String numberOfFlight;

    BoardManagement(List<Flight> flightList) {
        super(flightList);
    }

    public List<Flight> searchByNumberOfFlight (String numberOfFlight) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getNumberOfFlight().equals(numberOfFlight))
                .collect(Collectors.toList());
        return filtered;
    }

    List<Flight> searchByAirCompany (String airCompany) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getAirCompany().equals(airCompany))
                .collect(Collectors.toList());
        return filtered;
    }

    List<Flight> searchByPrice (double priceOfTicket) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getPriceOfTicket() == priceOfTicket)
                .collect(Collectors.toList());
        return filtered;
    }

}
