package session4.Gioi1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEmailTest {
    private  CheckEmail checkEmail;
    @BeforeEach
    void setUp() {
        checkEmail = new CheckEmail();
    }

    @Test
    void TC1_validataEmail() throws IllegalAccessException {
        String email = "user@gmail.com";
        String result = checkEmail.validataEmail(email);
        assertEquals("user@gmail.com",result);
    }
    @Test
    void TC2_validataEmail() {
        String email = "usergmail.com";

        assertThrows(IllegalAccessException.class, () -> {
            checkEmail.validataEmail(email);
        });
    }

    @Test
    void TC3_validataEmail() {
        String email = "user@";

        assertThrows(IllegalAccessException.class, () -> {
            checkEmail.validataEmail(email);
        });
    }

    @Test
    void TC4_validataEmail() throws IllegalAccessException {
        String email = "User@Gmail.com";
        String result = checkEmail.validataEmail(email);
        assertEquals("user@gmail.com",result);
    }

}