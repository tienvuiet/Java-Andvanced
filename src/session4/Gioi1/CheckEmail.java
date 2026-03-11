package session4.Gioi1;

public class CheckEmail {
    public String validataEmail(String email) throws  IllegalAccessException{
        if(email == null || email.isEmpty()) return null;
        if(!email.contains("@")) {
          return null;
        };
        String[] parts = email.split("@");
        if (parts.length != 2){
            return null;
        }
        if( parts[1].equalsIgnoreCase("gmail.com")) {
            return email.toLowerCase();
        }else{
            throw new IllegalAccessException("Email cannot be negative");
        }

    }
}
