package w9.Models;

public enum Airbus {
    A310("A310"),
    A320("A320"),
    A330("A330");

    private final String name;

    Airbus(String s) {name = s;}

    @Override
    public String toString() {
        return this.name;
    }
}
