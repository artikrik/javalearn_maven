package w9;

import java.util.List;
import java.util.stream.Collectors;

public class BoardManagement extends BoardOfFlights {

    private List<Flight> flightList = super.getFlightList();

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Flight flight : flightList) {
            temp.append(flight.toString()).append("\n");
        }
        return temp.toString();
    }

    BoardManagement(List<Flight> flightList) {
        super(flightList);
    }

    List<Flight> searchByNumberOfFlight(String numberOfFlight) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getNumberOfFlight().equals(numberOfFlight))
                .collect(Collectors.toList());
        return filtered;
    }

    List<Flight> searchByAirCompany(String airCompany) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getAirCompany().equals(airCompany))
                .collect(Collectors.toList());
        return filtered;
    }

    List<Flight> searchByPrice(double priceOfTicket) {
        List<Flight> filtered;
        filtered = flightList.stream()
                .filter(flight -> flight.getPriceOfTicket() == priceOfTicket)
                .collect(Collectors.toList());
        return filtered;
    }

    void deleteByNumberOfFlight(String numberOfFlight) {
        flightList.removeIf(flight -> flight.getNumberOfFlight().equals(numberOfFlight));
    }

    void deleteByAirplaneModel(String model) {flightList.removeIf(flight -> flight.getModel().equals(model));
    }
}
