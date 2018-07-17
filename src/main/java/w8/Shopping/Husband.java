package w8.Shopping;

import java.util.ArrayList;

public class Husband implements Person {
    private ArrayList<Product> cart = new ArrayList<>();
    private ArrayList<String> orderList;
    private Mall mall;

    Husband(){
        
    }
    Husband(ArrayList<String> orderList, Mall mall) {
        setOrder(orderList);
        setMall(mall);
    }

    void setOrder(ArrayList<String> orderList) {
        this.orderList = orderList;
    }

    void setMall(Mall mall) {
        this.mall = mall;
    }

    @Override
    public void doShopping() {
        ArrayList<Shop> shops = mall.getShopList();
        cart.clear();
        for (Shop shop : shops) {
            passShop(shop);
        }
        printTotal();
        System.out.println();
        printTotalBuyed();
    }


    private void printTotal() {
        ArrayList<Shop> shops = mall.getShopList();
        System.out.println("Total list:");
        for (Shop shop : shops) {
            for (Product product : shop.getProductsInShop()) {
                System.out.println(product.toString());
            }
        }
    }

    private void printTotalBuyed() {
        System.out.println("I have buyed:");
        int a = 0;
        for (Product product : cart) {
            System.out.println(product.toString());
            a = product.getPrice() + a;
        }
        System.out.println("Total price = " + a);
    }

    private void addToCart(Product product) {
        this.cart.add(product);
    }

    private void passShop(Shop shop) {
        for (String order : orderList)
            for (Product product : shop.getProductsInShop()) {
                if (product.getName().matches(order))
                    addToCart(product);
            }
    }

}
