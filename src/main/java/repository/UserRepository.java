
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // You can add custom query methods here if needed
    // Example: Find a user by their username
    User findByUserName(String userName);
    
    // Example: Find a user by their role
    User findByRole(String role);
}

