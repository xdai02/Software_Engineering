public class NullUser extends User {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "N/A";
    }
}
