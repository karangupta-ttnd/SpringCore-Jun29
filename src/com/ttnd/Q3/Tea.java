package com.ttnd.Q3;

import org.springframework.stereotype.Component;

/**
 * Created by karan on 13/7/17.
 */
@Component
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea method");
    }
}
