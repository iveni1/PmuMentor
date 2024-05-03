public class User {
    private String username;
    private String password;
    private String email;
}

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void createUser(String username, String password, String email) {
        // Add validation checks for username, password, and email
        users.put(username, new User(username, password, email));
    }

}
