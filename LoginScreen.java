public class LoginScreen {
    public boolean authenticate(String username, String password) {
        if ("validUser".equals(username) && "validPassword".equals(password)) {
            return true;
        }
        return false;
    }
}