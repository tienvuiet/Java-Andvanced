package session2.Gioi1;

public class Account implements  Authenticatable{
    private String password;

    public Account(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
