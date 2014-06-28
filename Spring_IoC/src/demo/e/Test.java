package demo.e;

import demo.e.entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 14-6-28.
 */
public class Test {
    public static void main(String[] args) {

//        ...
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo/e/beans.xml");
        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
        Session session = sessionFactory.openSession();

        session.save(new Human(null, "李四", 18, 1.8));
        session.beginTransaction().commit();
        session.close();

        System.out.println("done.");
    }
}
