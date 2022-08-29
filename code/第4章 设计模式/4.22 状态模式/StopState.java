public class StopState implements State {
    @Override
    public void action(Context context) {
        context.setState(this);
        System.out.println("In stop state ...");
    }

    @Override
    public String toString() {
        return "StopState";
    }
}
