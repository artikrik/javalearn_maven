package w8.Shopping;

import java.util.ArrayList;

public class Mall{
    private ArrayList<Shop> shopArrayList;

    Mall() {
        shopArrayList = new ArrayList<>();
    }

    public void addShop(Shop shop) {
        this.shopArrayList.add(shop);
    }

    public ArrayList<Shop> getShopList() {
        return shopArrayList;
    }
}
