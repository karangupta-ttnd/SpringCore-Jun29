package com.ttnd.Q3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


/**
 * Created by karan on 13/7/17.
 */
@Repository
public class Restaurent {

    private HotDrink hotDrink1;

    @Autowired
   public Restaurent(HotDrink hotDrink){
       hotDrink1=hotDrink;
   }
    public HotDrink getHotDrink1() {
        return hotDrink1;
    }
    public void setHotDrink1(HotDrink hotDrink)
    {
        hotDrink1=hotDrink;
    }
}
