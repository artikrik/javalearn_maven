package w9;

class Flight {
    private String numberOfFlight;
    private String airCompany;
    private Airplane airplane;
    private double priceOfTicket;
    private int distance;
    private String manufacturer;
    private String model;

    Flight(String numberOfFlight, String airCompany, Airplane airplane, double priceOfTicket, int distance) {
        setNumberOfFlight(numberOfFlight);
        setAirCompany(airCompany);
        setAirplane(airplane);
        setPriceOfTicket(priceOfTicket);
        setDistance(distance);
        this.manufacturer = this.airplane.getManufacturer().toString();
        this.model = airplane.getModel().toString();
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

    public Airplane getAirplane() {
        return airplane;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }

    public int getDistance() {
        return distance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "numberOfFlight= " + numberOfFlight + '\t' +
                "airCompany= " + airCompany + '\t' + airplane.toString() + '\t' +
                "priceOfTicket= " + priceOfTicket + '\t' +
                "distance= " + distance;
    }
}
