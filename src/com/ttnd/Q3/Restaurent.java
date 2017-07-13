package com.ttnd.Q3;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by karan on 13/7/17.
 */
public class Restaurent {

    HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }

    @Required
    public void setHotDrink1(HotDrink hotDrink) {
        this.hotDrink1 = hotDrink;
    }

}
