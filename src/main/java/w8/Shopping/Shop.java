package w8.Shopping;

import java.util.ArrayList;

public class Shop extends ArrayList<Product>{
    private String name;

    Shop(String name) {
                this.name = name;
    }

//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//
//        for (Product d : this) {
//            result.append(d.toString()).append("\n");
//        }
//
//        return result.toString();
//    }

    void addProduct(Product product) {
        this.add(product);
    }
}
