package session2.XuatSac1;

public interface UserActions {
    default void  logActivity(String activity){
        System.out.println("Hanh dong: "+ activity);
    }
}
