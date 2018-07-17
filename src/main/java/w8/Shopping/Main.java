package w8.Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mall mall = new Mall();

        Shop tech = new Shop("Tech");
        Shop meals = new Shop("Meat");

        mall.addShop(tech);
        mall.addShop(meals);


        tech.addProduct(new Product("Sony", 100));
        tech.addProduct(new Product("Samsung", 80));
        tech.addProduct(new Product("Sharp", 70));
        tech.addProduct(new Product("Apple", 300));
        tech.addProduct(new Product("Acer", 40));
        meals.addProduct(new Product("Bread", 110));
        meals.addProduct(new Product("Sausage", 80));
        meals.addProduct(new Product("Butter", 70));
        meals.addProduct(new Product("Milk", 300));
        meals.addProduct(new Product("Potato", 40));


        Wife klara = new Wife();

        Husband panBoris = new Husband();

        panBoris.setMall(mall);
        klara.setHusband(panBoris);

        ArrayList<String> orderList = klara.getOrderList();
        orderList.add("Sharp");
        orderList.add("Apple");


        panBoris.setOrder(orderList);

        panBoris.doShopping();
        System.out.println();

        ArrayList<String> orderList2 = new ArrayList<>();
        klara.setOrderList(orderList2);
        orderList2.add("Sharp");
        orderList2.add("Apple");
        orderList2.add("Butter");

        Husband panMykola = new Husband(orderList2, mall);
        klara.doShopping();
        System.out.println();
        klara.doShopping(panMykola,orderList2);
        System.out.println();


        Wife tamara = new Wife(panMykola,orderList);
        orderList.clear();
        tamara.doShopping();
    }

}
