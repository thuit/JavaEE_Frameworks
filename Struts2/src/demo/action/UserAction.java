package demo.action;

import demo.action.util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Administrator on 14-6-21.
 */
public class UserAction {

    private String username;
    private String password;

    private Connection connection = DB.getConnection();

    public String login() throws Exception {
        System.out.println("login:" + username + ", " + password);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username=? and password = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean b = resultSet.next();
        DB.close(resultSet, preparedStatement, null);
        if (b) {
            return "success";
        } else {
            return "input";
        }
    }

    public String signup() throws Exception {
        System.out.println("signup:" + username + ", " + password);
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(null, ?, ?)");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.executeUpdate();
        DB.close(null, preparedStatement, null);
        return "success";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
