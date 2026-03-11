package session4.Kha2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAgeTest {
    CheckAge checkAge ;
    @BeforeEach
    void setUp() {
        checkAge = new CheckAge();
    }

    @Test
    void TC01_checkRegistrationAge() {
        int age = 18;
        boolean result = checkAge.checkRegistrationAge(age);
        assertEquals(true, result);
    };
    @Test
    void TC02_checkRegistrationAge() {
        int age = 17;
        boolean result = checkAge.checkRegistrationAge(age);
        assertEquals(false, result);
    }
    @Test
    void TC03_checkRegistrationAge() {
        int age = -1;
        boolean result = checkAge.checkRegistrationAge(18);
        assertThrows(IllegalAccessException.class,  () -> checkAge.checkRegistrationAge(age) );
    }


}