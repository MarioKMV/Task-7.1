package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

 List<User> getAllUsers();

 User readUser(int id);

 User deleteUser(int parseUnsignedInt);

 void createOrUpdateUser(User user);
}
