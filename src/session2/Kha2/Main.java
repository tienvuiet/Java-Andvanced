package session2.Kha2;

public class Main{
    static void main(String[] args) {
        PasswordValidate validate = (String password) -> {
            return password.length() >= 8;
        };
        System.out.println(validate.isValid("12345678"));
        System.out.println(validate.isValid("1234"));
    }

}
