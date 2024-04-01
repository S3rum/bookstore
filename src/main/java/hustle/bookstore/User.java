package hustle.bookstore;
import jakarta.persistence.*;

@Entity
@Table(name = "users") // You can customize the table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;


    public String getPassword() {
        return password;
    }

    public void setPassword(String encodedPassword) {
        encodedPassword = password;
    }
}