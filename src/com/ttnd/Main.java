package com.ttnd;

import com.ttnd.Q3.ExpressTea;
import com.ttnd.Q3.HotDrink;
import com.ttnd.Q3.Restaurent;
import com.ttnd.Q3.Tea;
import com.ttnd.Q5.Complex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by karan on 13/7/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Restaurent restaurent =(Restaurent)context.getBean("teaRestaurent");
        System.out.println(context.isPrototype("teaRestaurent"));
    }

}
