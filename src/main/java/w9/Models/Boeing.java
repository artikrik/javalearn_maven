package w9.Models;

public enum Boeing {
    Boeing_737("737"),
    Boeing_747("747"),
    Boeing_767("767"),
    Boeing_777("777");

    private final String name;

    Boeing(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
