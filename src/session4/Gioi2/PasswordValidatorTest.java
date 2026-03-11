package session4.Gioi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator passwordValidator;
    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    void evaluatePasswordStrength() {
        assertAll(

                // TC01
                () -> assertEquals("Mạnh",
                        passwordValidator.evaluatePasswordStrength("Abc123!@")),

                // TC02
                () -> assertEquals("Trung bình",
                        passwordValidator.evaluatePasswordStrength("abc123!@")),

                // TC03
                () -> assertEquals("Trung bình",
                        passwordValidator.evaluatePasswordStrength("ABC123!@")),

                // TC04
                () -> assertEquals("Trung bình",
                        passwordValidator.evaluatePasswordStrength("Abcdef!@")),

                // TC05
                () -> assertEquals("Trung bình",
                        passwordValidator.evaluatePasswordStrength("Abc12345")),

                // TC06
                () -> assertEquals("Yếu",
                        passwordValidator.evaluatePasswordStrength("Ab1!")),

                // TC07
                () -> assertEquals("Yếu",
                        passwordValidator.evaluatePasswordStrength("password")),

                // TC08
                () -> assertEquals("Yếu",
                        passwordValidator.evaluatePasswordStrength("ABC12345"))

        );

    }
}