package demo.controller;

import demo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 14-6-29.
 */
@Controller//Spring bean
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/signup")
    public String signup(HttpServletRequest request) {
        Session session = sessionFactory.openSession();
        session.save(new User(null, request.getParameter("username"), request.getParameter("password")));
        session.beginTransaction().commit();
        session.close();
        return "/index";
    }
}
