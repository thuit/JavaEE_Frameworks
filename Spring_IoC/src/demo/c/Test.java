package demo.c;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 14-6-28.
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business();
//        business.setDeviceWriter(new USBWriter());
//        business.save();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo/c/beans.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.save();
    }
}
