public class User implements Login {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void login() {
        System.out.println(username + " login succeed.");
    }
}
