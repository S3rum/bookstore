package hustle.bookstore;

public interface UserService {
    User saveUser(User user);
    User getUserByUsername(String username);
    // ... other methods as needed in the future (update, delete, etc.)
}