package w9;

class Flight {
    private String numberOfFlight;
    private String airCompany;
    private Airplane airplane;
    private double priceOfTicket;
    private int distance;

    Flight(String numberOfFlight, String airCompany, Airplane airplane, double priceOfTicket, int distance) {
        setNumberOfFlight(numberOfFlight);
        setAirCompany(airCompany);
        setAirplane(airplane);
        setPriceOfTicket(priceOfTicket);
        setDistance(distance);
    }

    @Override
    public String toString() {
        return "numberOfFlight= " + numberOfFlight + '\t' +
                "airCompany= " + airCompany + '\t' + airplane.toString() + '\t' +
                "priceOfTicket= " + priceOfTicket + '\t' +
                "distance= " + distance;
    }

    private void setNumberOfFlight(String numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    private void setAirCompany(String airCompany) {
        this.airCompany = airCompany;
    }

    private void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    private void setPriceOfTicket(double priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    private void setDistance(int distance) {
        this.distance = distance;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public String getAirCompany() {
        return airCompany;
    }

    public String getModel() {
        return airplane.model;
    }
    public String getManufacturer() {
        return airplane.manufacturer;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }

    public int getDistance() {
        return distance;
    }

    //COMPARATORS
    public static class ByDistance extends AbstractComparator {
        ByDistance(AbstractComparator next) {
            super(next);
        }

        public int doCompare(Flight flight1, Flight flight2) {
            return flight1.getDistance() - flight2.getDistance();
        }
    }

    public static class ByPriceOfTicket extends AbstractComparator {
        ByPriceOfTicket(AbstractComparator next) {
            super(next);
        }

        public int doCompare(Flight flight1, Flight flight2) {
            return Double.compare(flight1.getPriceOfTicket(),flight2.getPriceOfTicket());
        }
    }

    public static class ByAirCompany extends AbstractComparator {
        public ByAirCompany(AbstractComparator next) {
            super(next);
        }

        public int doCompare(Flight flight1, Flight flight2) {
            return flight1.getAirCompany().compareTo(flight2.getAirCompany());
        }
    }

    public static class ByManufacturer extends AbstractComparator {
        public ByManufacturer(AbstractComparator next) {
            super(next);
        }

        public int doCompare(Flight flight1, Flight flight2) {
            return flight1.getManufacturer().compareTo(flight2.getManufacturer());
        }
    }

    public static class ByModel extends AbstractComparator {
        public ByModel(AbstractComparator next) {
            super(next);
        }

        public int doCompare(Flight flight1, Flight flight2) {
            return flight1.getModel().compareTo(flight2.getModel());
        }
    }

}
