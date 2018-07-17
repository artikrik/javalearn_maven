package w8.Shopping;

import java.util.ArrayList;

class Mall{
    private ArrayList<Shop> shopArrayList;

    Mall() {
        shopArrayList = new ArrayList<>();
    }

    void addShop(Shop shop) {
        this.shopArrayList.add(shop);
    }

    ArrayList<Shop> getShopList() {
        return shopArrayList;
    }
}
