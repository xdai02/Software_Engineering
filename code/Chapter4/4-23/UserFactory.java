public class UserFactory {
    public static final String[] names = {
        "Terry", "Lily", "Henry", "Bob"
    };

    public static User getUser(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)) {
                return new RealUser(name);
            }
        }
        return new NullUser();
    }
}
