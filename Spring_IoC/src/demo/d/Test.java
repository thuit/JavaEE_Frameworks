package demo.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 14-6-28.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo/d/beans.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
}
