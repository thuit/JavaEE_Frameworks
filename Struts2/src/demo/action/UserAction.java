package demo.action;

import demo.action.entity.User;
import demo.action.util.DB;
import demo.action.util.HibernateUtil;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 14-6-21.
 */
public class UserAction extends BaseAction {

    private User user;
    private Connection connection = DB.getConnection();

    public String login() throws Exception {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM User where username=:username and password=:password");
        query.setString("username", user.getUsername());
        query.setString("password", user.getPassword());
        List<User> users = query.list();
        session.close();
        if (users.size() > 0) {
            getSession().put("user", user);
            return "login_success";
        } else {
            getRequest().put("message", "invalid username or password.");//request.setAttribute("m..", "i...");
            return "login_input";
        }
    }

    public String signup() throws Exception {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);//connection
        transaction.commit();
        session.close();
        return "signup_success";
    }

    public String logout() throws Exception {
        getSession().clear();
        return "logout_success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
