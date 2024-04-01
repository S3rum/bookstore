package hustle.bookstore.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public interface SecurityConfigInterface {

    Authentication authenticate(Authentication authentication)
        throws AuthenticationException;
}
