package com.ttnd;

import com.ttnd.Q3.ExpressTea;
import com.ttnd.Q3.HotDrink;
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

        HotDrink expressTea =(ExpressTea) context.getBean("expressTea");
        HotDrink tea =(Tea) context.getBean("tea");
        expressTea.prepareHotDrink();
        tea.prepareHotDrink();


    }

}
