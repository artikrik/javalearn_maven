package w8.Shopping;

import java.util.ArrayList;

public class Mall{
    private ArrayList<Shop> shopArrayList;

    public Mall() {
        shopArrayList = new ArrayList<Shop>();
    }

    public void addShop(Shop shop) {
        this.shopArrayList.add(shop);
    }

    public ArrayList<Shop> getShopList() {
        return shopArrayList;
    }
}
