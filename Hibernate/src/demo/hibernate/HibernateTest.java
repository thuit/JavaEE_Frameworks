package demo.hibernate;

import demo.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Administrator on 14-6-22.
 */
public class HibernateTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        insert DML

        User user = new User(null, "d", "d");
        session.save(user);//insert...
        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("done.");
    }
}
