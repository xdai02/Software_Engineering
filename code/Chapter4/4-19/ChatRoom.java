import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String msg) {
        System.out.println(
                String.format("[%s] %s: %s",
                            new Date().toString(),
                            user.getName(),
                            msg)
        );
    }
}
