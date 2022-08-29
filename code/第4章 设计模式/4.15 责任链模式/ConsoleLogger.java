public class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Console: " + msg);
    }
}
