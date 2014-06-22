package demo.hibernate;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 14-6-22.
 */
public class JDBCTeset {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            new Driver();
            connection = DriverManager.getConnection("jdbc:mysql:///test?user=root&password=123456");
            preparedStatement = connection.prepareStatement("insert into user values(null, ?, ?)");
            preparedStatement.setString(1, "b");
            preparedStatement.setString(2, "b");
            preparedStatement.executeUpdate();
            System.out.println("done.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
