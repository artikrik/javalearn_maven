package w9;


public enum Airplane {
    AIRBUS_A310("Airbus", "A310"),
    AIRBUS_A320("Airbus", "A320"),
    AIRBUS_A330("Airbus", "A330"),
    BOEING_737("Boeing", "737"),
    BOEING_747("Boeing", "747"),
    BOEING_767("Boeing", "767"),
    BOEING_777("Boeing", "777"),
    EMBRAER_175("Embraer", "175"),
    EMBRAER_190("Embraer", "190"),
    EMBRAER_195("Embraer", "195");

    String manufacturer;
    String model;

    Airplane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model;
    }
}