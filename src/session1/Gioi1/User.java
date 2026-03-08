package session1.Gioi1;

import session1.XuatXac1.InvalidAgeException;

public class User {
    private int age ;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if(age<0){
            throw  new InvalidAgeException("Tuoi khong the am");
        }
        this.age = age;
    }

}
