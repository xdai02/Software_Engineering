public class NullObjectPatternDemo {
    public static void main(String[] args) {
        User user1 = UserFactory.getUser("Terry");
        User user2 = UserFactory.getUser("John");
        User user3 = UserFactory.getUser("Alice");
        User user4 = UserFactory.getUser("Lily");

        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());
        System.out.println(user4.getName());
    }
}
