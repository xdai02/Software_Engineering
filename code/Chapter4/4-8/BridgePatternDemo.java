public class BridgePatternDemo {
    public static void main(String[] args) {
        OS os = new Linux();
        Program program = new Version(os);
        program.programInfo();
    }
}
