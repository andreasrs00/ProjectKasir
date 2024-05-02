import java.util.ArrayList;
import java.util.List;

public class Authentication {
    private List<User> users;

    // Constructor
    public Authentication() {
        users = new ArrayList<>();
    }

    // Method to add user
    public void addUser(User user) {
        users.add(user);
    }

    // Method to authenticate user
    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
