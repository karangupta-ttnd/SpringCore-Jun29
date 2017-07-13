package com.ttnd;

import com.ttnd.Q3.ExpressTea;
import com.ttnd.Q3.HotDrink;
import com.ttnd.Q3.Restaurent;
import com.ttnd.Q3.Tea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by karan on 13/7/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Database db =(Database) context.getBean("db");
//        System.out.println(db.toString());

       Restaurent obj=(Restaurent) context.getBean("teaRestaurent");
       obj.getHotDrink().prepareHotDrink();

    }

}
