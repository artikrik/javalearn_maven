package w9;

import w9.Models.Airbus;
import w9.Models.Boeing;
import w9.Models.Embraer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(Manufacturer.Airbus, Airbus.A320);
        Airplane airplane2 = new Airplane(Manufacturer.Boeing, Boeing.Boeing_747);
        Airplane airplane3 = new Airplane(Manufacturer.Embraer, Embraer.Embraer_190);
        System.out.println(airplane.toString());
        System.out.println(airplane2.toString());
        System.out.println(airplane3.toString());

        Flight flight = new Flight("F1", "Aab", airplane, 100.0, 350);
        Flight flight2 = new Flight("F2", "Abc", airplane2, 120.2, 500);
        Flight flight3 = new Flight("F3", "Acc", airplane3, 300.5, 1200);

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
