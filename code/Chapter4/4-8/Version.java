public class Version extends Program {
    public Version(OS os) {
        super(os);
    }

    @Override
    public void programInfo() {
        System.out.println("Program v1.0 running on " + super.getOS());
    }
}
