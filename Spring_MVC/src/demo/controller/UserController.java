package demo.controller;

import demo.dao.userDao;
import demo.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 14-6-29.
 */
@Controller//Spring bean
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    @Qualifier(value = "JDBCDao")
    private userDao userDao;

    @RequestMapping("/signup")
    public String signup(User user) {
        userDao.add(user);
        return "redirect:/index.jsp";
    }

//    @RequestMapping("/login")
//    public String login(User user) {
//        Session session = sessionFactory.openSession();
//        Query query = session.createQuery("FROM User where username=:username and password=:password");
//        query.setString("username", user.getUsername());
//        query.setString("password", user.getPassword());
//        List<User> users = query.list();
//        session.close();
//        if (users.size() > 0) {
//            getSession().setAttribute("user", user);
//            return "redirect:/home.jsp";
//        } else {
//            getRequest().setAttribute("message", "invalid username or password.");
//            return "/index";
//        }
//    }

    @RequestMapping("/logout")
    public String logout() {
        getSession().invalidate();
        return "redirect:/index.jsp";
    }
}
