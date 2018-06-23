package w8.Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mall mall = new Mall();

        Shop tech = new Shop("Tech");
        Shop meals = new Shop("Myasko");

        mall.addShop(tech);
        mall.addShop(meals);


        tech.addProduct(new Product("Sony", 100));
        tech.addProduct(new Product("Samsung", 80));
        tech.addProduct(new Product("Sharp", 70));
        meals.addProduct(new Product("Bread", 110));
        meals.addProduct(new Product("Sausage", 80));
        meals.addProduct(new Product("Butter", 70));


        System.out.print(tech.toString());
        System.out.print(meals.toString());


        Wife klara = new Wife();
        Husband panBoris = new Husband();
        panBoris.setMall(mall);
        klara.setHusband(panBoris);

        ArrayList<String> orderList = klara.getOrderList();
        orderList.add("Sharp");
        orderList.add("Apple");



//        panBoris.setOrder(orderList);
       // panBoris.doShopping();

  //      klara.doShopping();
        System.out.println();
        Wife tamara =new Wife();
        tamara.doShopping();
    }

}
