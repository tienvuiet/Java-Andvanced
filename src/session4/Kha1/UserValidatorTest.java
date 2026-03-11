package session4.Kha1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private  UserValidator userValidator;
    @BeforeEach
    void setUp() {
        userValidator = new UserValidator();

    }

    @Test
    void TC01isValidUsername() {
        String userName = "user123";
        boolean result = userValidator.isValidUsername(userName);
        assertTrue(result);
    }
    @Test
    void TC02isValidUsername() {
        String userName = "user 123";
        boolean result = userValidator.isValidUsername(userName);
        assertTrue(result);
    }
}