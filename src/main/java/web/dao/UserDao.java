package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void createUser(User user);

    void updateUser(User user,long id);

    void deleteUserById(Long id);
}
