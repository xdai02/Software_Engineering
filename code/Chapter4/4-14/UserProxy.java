public class UserProxy implements Login {
    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    @Override
    public void login() {
        System.out.println("Check username / password...");
        user.login();
    }
}
