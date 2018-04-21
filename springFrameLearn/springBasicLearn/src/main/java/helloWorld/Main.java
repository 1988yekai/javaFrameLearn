package helloWorld;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yek on 2016/9/1.
 */
public class Main {
    public static void main(String[] args) {
        //创建IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //从容器中获取Bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //调用方法
        helloWorld.hello();

        //p 命名空间调用 set 方法
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld1");
        //调用方法
        helloWorld1.hello();

    }

}
