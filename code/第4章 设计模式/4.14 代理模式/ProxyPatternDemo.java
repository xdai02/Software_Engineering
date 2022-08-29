public class ProxyPatternDemo {
    public static void main(String[] args) {
        Login login = new UserProxy(new User("Admin"));
        login.login();
    }
}
