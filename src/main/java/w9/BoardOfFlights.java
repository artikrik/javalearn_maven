package w9;

import java.util.Comparator;
import java.util.List;

public class BoardOfFlights {
    private List<Flight> flightList;

    BoardOfFlights(List<Flight> flightList) {
        setFlightList(flightList);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    private void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Flight flight : flightList) {
            temp.append(flight.toString()).append("\n");
        }
        return temp.toString();
    }

    void addToFlightList(Flight flight) {
        this.flightList.add(flight);
    }

    void printBoard(){
        System.out.println(this.toString());
    }

    void printSortedFlightsByPriceOfTicket (){
        sortByPriceOfTicket(flightList);
        printBoard();
    }

    void printSortedFlightsByDistance (){
        sortByDistance(flightList);
        printBoard();
    }

    void printSortedFlightsByAirCompanyThenByPrice (){
        sortByAirCompany(flightList);
        sortByPriceOfTicket(flightList);
        printBoard();
    }

    void printSortedFlightsByDistanceThenByManufacturerThenByModel (){
        sortByDistance(flightList);
        sortByAirplaneManufacturer(flightList);
        sortByAirplaneModel(flightList);
        printBoard();
    }

    private static void sortByPriceOfTicket(List<Flight> flightList) {
        flightList.sort(Comparator.comparingDouble(Flight::getPriceOfTicket));
    }

    private static void sortByDistance(List<Flight> flightList) {
        flightList.sort(Comparator.comparingInt(Flight::getDistance));
    }

    private static void sortByAirCompany(List<Flight> flightList) {
        flightList.sort(Comparator.comparing(Flight::getAirCompany));
    }

    private static void sortByAirplaneManufacturer(List<Flight> flightList) {
        flightList.sort(Comparator.comparing(Flight::getManufacturer));
    }

    private static void sortByAirplaneModel(List<Flight> flightList) {
        flightList.sort(Comparator.comparing(Flight::getModel));
    }

}
