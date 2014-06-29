package demo.dao.impl;

import com.mysql.jdbc.Driver;
import demo.dao.userDao;
import demo.entity.User;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 14-6-29.
 */
@Component
public class JDBCDao implements userDao {
    @Override
    public void add(User user) {
        System.out.println("jdbc...");
        try {
            new Driver();
            Connection connection = DriverManager.getConnection("jdbc:mysql:///test?user=root&password=123456");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(null, ?, ?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
