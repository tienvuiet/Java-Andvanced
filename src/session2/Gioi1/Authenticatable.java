package session2.Gioi1;

public interface Authenticatable {
    String getPassword();
    default boolean isAuthenticated(){
       return !getPassword().isEmpty();
    }
    static String  encrypt(String rawPassword){
       return "PC" + rawPassword;
    }

}
