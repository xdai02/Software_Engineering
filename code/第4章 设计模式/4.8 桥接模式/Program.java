public abstract class Program {
    private OS os;

    public Program(OS os) {
        this.os = os;
    }

    public String getOS() {
        return os.getOS();
    }

    public abstract void programInfo();
}
