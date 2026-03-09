package session2.XuatSac1;

public class SuperAdmin implements  AdminActions, UserActions{
    @Override
    public void logActivity(String activity) {
        AdminActions.super.logActivity(activity);
    }

}
