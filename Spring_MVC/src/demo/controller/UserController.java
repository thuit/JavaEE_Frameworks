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
    private userDao userDao;

    @RequestMapping("/signup")
    public String signup(User user) {
        userDao.add(user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("/login")
    public String login(User user) {
        user = userDao.login(user);
        if (user != null) {
            getSession().setAttribute("user", user);
            return "redirect:/home.jsp";
        } else {
            getRequest().setAttribute("message", "invalid username or password.");
            return "/index";
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        getSession().invalidate();
        return "redirect:/index.jsp";
    }
}
