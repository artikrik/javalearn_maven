package w9;

import java.util.ArrayList;
import java.util.List;

public class BoardOfFlights {
    private List<Flight> flightList;

    BoardOfFlights() {
        setFlightList(new ArrayList<>());
    }

    BoardOfFlights(List<Flight> flightList) {
        setFlightList(flightList);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

//    @Override
//    public String toString() {
//        return "flightList=" + flightList + "\n";
//    }

        @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Flight d : this.flightList) {
            result.append(d.toString()).append("\n");
        }

        return result.toString();
    }

    void addToFlightList(Flight flight) {
        this.flightList.add(flight);
    }
}
