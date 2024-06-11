// File: src/test/java/LoginScreenTest.java

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginScreenTest {
    private LoginScreen loginScreen;

    @BeforeEach
    public void setUp() {
        loginScreen = new LoginScreen();
    }

    @Test
    public void testValidLogin() {
        assertTrue(loginScreen.authenticate("validUser", "validPassword"));
    }

    @Test
    public void testInvalidLogin() {
        assertFalse(loginScreen.authenticate("invalidUser", "invalidPassword"));
    }
}
