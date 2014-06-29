package demo.dao;

import demo.entity.User;

import java.util.List;

/**
 * Created by Administrator on 14-6-29.
 */
public interface userDao {
    void add(User user);
    User login(User user);
}
