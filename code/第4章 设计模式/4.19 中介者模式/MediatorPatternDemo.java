public class MediatorPatternDemo {
    public static void main(String[] args) {
        User user1 = new User("Terry");
        User user2 = new User("Lily");

        user1.sendMessage("Hi, Lily!");
        user2.sendMessage("Hello, Terry!");
    }
}
