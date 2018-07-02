package w9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("F1", "Aab", Airplane.AIRBUS_A310, 100.0, 350);
        Flight flight2 = new Flight("F2", "Abc", Airplane.AIRBUS_A310, 120.2, 500);
        Flight flight3 = new Flight("F3", "Acc", Airplane.EMBRAER_190, 300.5, 1200);

        List<Flight> flights = new ArrayList<>();
        BoardOfFlights board = new BoardOfFlights(flights);
        board.addToFlightList(flight3);
        board.addToFlightList(flight);
        board.addToFlightList(flight2);


        System.out.println(board.toString());

        board.printSortedFlightsByPriceOfTicket();
        System.out.println(board.toString());

        BoardManagement manager = new BoardManagement(board.getFlightList());

        System.out.println("Search " + manager.searchByPrice(100.0));
        System.out.println("Search " + manager.searchByAirCompany("Aab"));

        System.out.println();
        manager.deleteByNumberOfFlight("F2");
        System.out.println(board.toString());

        manager.deleteByAirplaneModel("Airbus");
        System.out.println(board.toString());
        manager.deleteByAirplaneModel("A320");
        System.out.println(board.toString());

    }
}
