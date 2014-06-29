package demo.dao.impl;

import demo.dao.userDao;
import demo.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 14-6-29.
 */
@Repository
public class UserDaoImpl implements userDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }

    @Override
    public User login(User user) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM User where username=:username and password=:password");
        query.setString("username", user.getUsername());
        query.setString("password", user.getPassword());
        List<User> users = query.list();
        session.close();
        if (users.size() == 1) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
