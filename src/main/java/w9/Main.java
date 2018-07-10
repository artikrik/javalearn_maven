package w9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("F1", "Aab", Airplane.AIRBUS_A310, 122300.0, 3500);
        Flight flight2 = new Flight("F2", "Abc", Airplane.AIRBUS_A310, 12130.2, 51200);
        Flight flight3 = new Flight("F3", "Acc", Airplane.EMBRAER_190, 366600.5, 1200);

        List<Flight> flights = new ArrayList<>();
        BoardOfFlights board = new BoardOfFlights(flights);
        board.addToFlightList(flight3);
        board.addToFlightList(flight);
        board.addToFlightList(flight2);


        System.out.println("Печатаем табло полетов\n" +
                board.toString());

        flights.sort(new Flight.ByPriceOfTicket(null));
        System.out.println("виведення змісту набору на екран відсортованому по: вартості квітка\n" +
                board.toString());

        flights.sort(new Flight.ByDistance(null));
        System.out.println("виведення змісту набору на екран відсортованому по: відстані\n" +
                board.toString());

        flights.sort(new Flight.ByAirCompany(new Flight.ByPriceOfTicket(null)));
        System.out.println("виведення змісту набору на екран відсортованому по: авіакомпанії та вартості квітка\n" +
                board.toString());

        flights.sort(new Flight.ByDistance(new Flight.ByManufacturer(new Flight.ByModel(null))));
        System.out.println("виведення змісту набору на екран відсортованому по: відстані, виробнику та моделі\n" +
                board.toString());


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

    private static void comparatorByPrice(List<Flight> flights) {
    }
}
