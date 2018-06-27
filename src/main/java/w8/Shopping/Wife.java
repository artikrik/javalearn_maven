package w8.Shopping;

import java.util.ArrayList;

public class Wife implements Person {
    private Husband husband;
    private ArrayList<String> orderList;

    Wife() {
        orderList = new ArrayList<>();
    }

    Wife(Husband husband, ArrayList<String> orderList) {
        setHusband(husband);
        setOrderList(orderList);
    }

    ArrayList<String> getOrderList() {
        return orderList;
    }

    void setOrderList(ArrayList<String> orderList) {
        this.orderList = orderList;
    }

    void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public void doShopping() {
        doShopping(husband);
    }

    public void doShopping(Husband husband) {
        if (!orderList.isEmpty() && husband != null) {
            husband.setOrder(orderList);
            husband.doShopping();
        } else {
            System.out.println("померла з голоду (Либо не указан муж, либо нету товаров в магазинах)");
        }
    }
}
