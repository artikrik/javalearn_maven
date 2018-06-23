package w8.Shopping;

import java.util.ArrayList;

public class Husband implements Person {
    ArrayList<Product> cart;
    ArrayList<String> orderList;
    Mall mall;

    Husband() {
        cart = new ArrayList<>();
    }

    public void setOrder(ArrayList<String> orderList) {
        this.orderList = orderList;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }

    @Override
    public void doShopping() {
        ArrayList<Shop> shops = mall.getShopList();
        for (Shop shop : shops) {
            passShop(shop);
        }
        printTotal();
    }

    private void printTotal() {
        System.out.println("I have buyed:");
        for (Product product : cart) {
            System.out.println(product.toString());
        }
    }

    private void addToCart(Product product) {
        this.cart.add(product);
    }

    private void passShop(Shop shop) {
        for (String order : orderList)
            for (Product product : shop) {
                if (product.getName().matches(order))
                    addToCart(product);
            }
    }

}
