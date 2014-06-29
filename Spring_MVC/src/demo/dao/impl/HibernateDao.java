package demo.dao.impl;

import demo.dao.userDao;
import demo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 14-6-29.
 */
@Component
public class HibernateDao implements userDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }
}
