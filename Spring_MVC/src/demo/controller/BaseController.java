package demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 14-6-29.
 */
public class BaseController {
    private HttpServletRequest request;
    private HttpSession session;

    public HttpServletRequest getRequest() {
        return request;
    }

    @ModelAttribute
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpSession getSession() {
        return session;
    }

    @ModelAttribute
    public void setSession(HttpSession session) {
        this.session = session;
    }
}
