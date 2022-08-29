public class BusinessDelegate {
    private Service service;
    private String serviceName;

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void work() {
        service = ServiceQuery.getService(serviceName);
        service.process();
    }
}
