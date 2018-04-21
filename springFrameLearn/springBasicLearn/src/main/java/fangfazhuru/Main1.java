package fangfazhuru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by yek on 2016/9/1.
 */
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ffzr.xml");
        Car car1 = (Car) context.getBean("car1");
        Car car2 = (Car) context.getBean("car2");
        System.out.println(car1);
        System.out.println(car2);

        Map<String, Car> map1 = (Map<String, Car>) context.getBean("map1");
        for (Map.Entry<String, Car> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
