package session4.XuatSac2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;
    private User existingUser;
    private List<User> allUsers;

    @BeforeEach
    void setUp() {
        userService = new UserService();
        existingUser = new User("old@mail.com", LocalDate.of(2000,1,1));
        allUsers = new ArrayList<>();
    }

    // Email hợp lệ + ngày sinh hợp lệ → cập nhật thành công
    @Test
    void updateProfile_validEmailAndBirthDate_shouldUpdateSuccessfully() {

        UserProfile newProfile =
                new UserProfile("new@mail.com", LocalDate.of(2001,1,1));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNotNull(result);
        assertEquals("new@mail.com", result.getEmail());
        assertEquals(LocalDate.of(2001,1,1), result.getBirthDate());
    }

    // Ngày sinh trong tương lai → từ chối cập nhật
    @Test
    void updateProfile_futureBirthDate_shouldRejectUpdate() {

        UserProfile newProfile =
                new UserProfile("new@mail.com", LocalDate.now().plusDays(1));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNull(result);
    }

    // Email trùng với user khác → từ chối cập nhật
    @Test
    void updateProfile_duplicateEmail_shouldRejectUpdate() {

        allUsers.add(new User("duplicate@mail.com", LocalDate.of(1999,1,1)));

        UserProfile newProfile =
                new UserProfile("duplicate@mail.com", LocalDate.of(2001,1,1));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNull(result);
    }

    // Email mới giống email hiện tại → vẫn cho phép cập nhật thông tin khác
    @Test
    void updateProfile_sameEmail_shouldAllowUpdate() {

        UserProfile newProfile =
                new UserProfile("old@mail.com", LocalDate.of(2002,2,2));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNotNull(result);
        assertEquals(LocalDate.of(2002,2,2), result.getBirthDate());
    }

    // Email hợp lệ nhưng danh sách user rỗng → cập nhật thành công
    @Test
    void updateProfile_validEmailButEmptyUserList_shouldUpdateSuccessfully() {

        UserProfile newProfile =
                new UserProfile("another@mail.com", LocalDate.of(2001,1,1));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNotNull(result);
    }

    // Email trùng + ngày sinh tương lai → vẫn bị từ chối
    @Test
    void updateProfile_duplicateEmailAndFutureBirthDate_shouldRejectUpdate() {

        allUsers.add(new User("duplicate@mail.com", LocalDate.of(1999,1,1)));

        UserProfile newProfile =
                new UserProfile("duplicate@mail.com", LocalDate.now().plusDays(5));

        User result = userService.updateProfile(existingUser, newProfile, allUsers);

        assertNull(result);
    }
}