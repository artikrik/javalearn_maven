package w9;

import java.util.ArrayList;
import java.util.Arrays;

public class Airplane {
    private String name;
    private Enum manufacturer;
    private Enum model;


    Airplane(Enum manufacturer, Enum model) {
        setManufacturer(manufacturer);
        setModel(model);
        setName();
    }

    public String getName() {
        return name;
    }

    private void setName() {
        this.name = getManufacturer().name() + " " + getModel().toString();
    }

    public Enum getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Enum manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Enum getModel() {
        return model;
    }

    public void setModel(Enum model) {
        this.model = model;
    }

    //    public static ArrayList<String> embraerModels = new ArrayList<>(
//            Arrays.asList(
//                    "175",
//                    "190",
//                    "195"
//            ));
//    public static ArrayList<String> boeingModels = new ArrayList<>(
//            Arrays.asList(
//                    "737",
//                    "747",
//                    "767",
//                    "777"
//            ));
//    static ArrayList<String> airbusModels = new ArrayList<>(
//            Arrays.asList(
//                    "A310",
//                    "A320",
//                    "A330"
//            ));


    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", manufacturer=" + manufacturer +
                ", model=" + model.toString() +
                '}';
    }
}