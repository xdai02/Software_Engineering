import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserByName(String name);
}
