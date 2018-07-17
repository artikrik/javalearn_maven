package w8.Shopping;

import java.util.ArrayList;

class Shop {
    private String name;
    private ArrayList<Product> productsInShop;

    Shop() {
        productsInShop = new ArrayList<>();
    }

    Shop(String name) {
        productsInShop = new ArrayList<>();
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
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

    ArrayList<Product> getProductsInShop() {
        return productsInShop;
    }

    void addProduct(Product product) {
        this.productsInShop.add(product);
    }
}
