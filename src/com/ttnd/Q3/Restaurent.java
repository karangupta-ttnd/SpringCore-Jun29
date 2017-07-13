package com.ttnd.Q3;

/**
 * Created by karan on 13/7/17.
 */
public class Restaurent {

    HotDrink hotDrink;
    @Override
    public String toString() {
        return "Restaurent{" +
                "hotDrink=" + hotDrink +
                '}';
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
