package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 14-6-29.
 */
@Controller//Spring bean
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/signup")
    public String signup(HttpServletRequest request) {
        System.out.println("singup...");
        System.out.println(request.getParameter("username") + ", " + request.getParameter("password"));
//        Hibernate...
        return "/index";
    }
}
