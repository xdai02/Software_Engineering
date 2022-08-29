import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private List<User> users;

    public UserDAOImpl() {
        users = new ArrayList<>();
        users.add(new User("Terry", 22));
        users.add(new User("Henry", 19));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserByName(String name) {
        for(User user : users) {
            if(name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }
}
