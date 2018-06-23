package w8.Shopping;

import java.util.ArrayList;

public class Wife implements Person {
    Husband husband;
    ArrayList<String> orderList;

    public Wife() {
    }

    public Wife(ArrayList<String> orderList) {
        this.orderList = orderList;
    }

    public Wife(Husband husband, ArrayList<String> orderList) {
        this.husband = husband;
        this.orderList = orderList;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }


    public ArrayList<String> getOrderList() {
        return new ArrayList<String>();
    }

    @Override
    public void doShopping() {
        if (husband != null && orderList!=null) {
            husband.setOrder(getOrderList());
            husband.doShopping();
        } else {
            System.out.println("померла з голоду");
        }
    }
}
