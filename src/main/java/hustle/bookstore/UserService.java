package hustle.bookstore;

public interface UserService {
    User saveUser(User user);
    User getUserByUsername(String username);

    
}