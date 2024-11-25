package services;

import model.User;
import java.util.List;

public interface UserService {
    // Method to get all users
    List<User> getAllUsers();
    // You can add other service methods as needed, for example:
    User getUserById(int userId);
    User saveUser(User user);
    void deleteUser(int userId);
}
