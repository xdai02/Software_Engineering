public class StartState implements State {
    @Override
    public void action(Context context) {
        context.setState(this);
        System.out.println("In start state ...");
    }

    @Override
    public String toString() {
        return "StartState";
    }
}
