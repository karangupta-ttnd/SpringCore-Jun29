package com.ttnd;

import com.ttnd.Q3.Restaurent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by karan on 13/7/17.
 */
@Controller
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Restaurent restaurent =(Restaurent)context.getBean("restaurent");
        restaurent.getHotDrink1().prepareHotDrink();
    }

}
