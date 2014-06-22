package demo.hibernate;

import demo.hibernate.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

/**
 * Created by Administrator on 14-6-22.
 */
public class HibernateTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);//Hibernate4.0
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        insert DML

        User user = new User(null, "a", "b");
        session.save(user);//insert...
        transaction.commit();

//        DQL

//        Query query = session.createQuery("FROM User");//Hibernate QL != Structured Query Language
//        List<User> users = query.list();
//
//        for (User user : users) {
//            System.out.println(user.getId() + ", " + user.getUsername() + ", " + user.getPassword());
//        }

//        List<Book> books = new ArrayList<Book>();
//        ResultSet resultSet = ...;
//
//        while (resultSet.next()) {
//            Book book = new Book();
//            books.add(book);
//        }

//        DML update

//        User user = (User) session.get(User.class, 1);//select * from user where id=1;
//        user.setPassword("a");
//
//        session.update(user);//update user set password='a' where id=1;
//        transaction.commit();

//               DML delete

//        User user = (User) session.get(User.class, 1);
//        session.delete(user);
//        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("done.");
    }
}
