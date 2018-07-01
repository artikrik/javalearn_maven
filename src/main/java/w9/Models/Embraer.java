package w9.Models;

public enum Embraer {
    Embraer_175("175"),
    Embraer_190("190"),
    Embraer_195("195");

    private final String name;

    Embraer(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
