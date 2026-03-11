package session4.Kha2;

public class CheckAge {
    public boolean checkRegistrationAge(int age){

        if(age < 0 ){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        return age>=0;
    }
}
