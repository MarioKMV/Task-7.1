package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getALLUsers();

   void createUser(User user);

   void updateUser(User user);

   User readUser(int id);

   User deleteUser(int id);
}
