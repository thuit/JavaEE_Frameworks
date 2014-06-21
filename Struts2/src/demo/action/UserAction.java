package demo.action;

import demo.action.entity.User;
import demo.action.util.DB;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 14-6-21.
 */
public class UserAction extends BaseAction {

    private User user;
    private Connection connection = DB.getConnection();

    public String login() throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username=? and password = ?");
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean b = resultSet.next();
        DB.close(resultSet, preparedStatement, null);
        if (b) {
            getSession().put("user", user);
            return "login_success";
        } else {
            getRequest().put("message", "invalid username or password.");//request.setAttribute("m..", "i...");
            return "login_input";
        }
    }

    public String signup() throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(null, ?, ?)");
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.executeUpdate();
        DB.close(null, preparedStatement, null);
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
