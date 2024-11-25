package services;

import model.User;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Implementing getAllUsers method
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Implementing getUserById method
    @Override
    public User getUserById(int userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);  // Return the user or null if not found
    }

    // Implementing saveUser method
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);  // Save or update user
    }

    // Implementing deleteUser method
    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);  // Delete the user by ID
    }
}
