public class CoarseGrainedObject {
    DependentObject1 obj1 = new DependentObject1();
    DependentObject2 obj2 = new DependentObject2();

    public void setData(String data1, String data2) {
        obj1.setData(data1);
        obj2.setData(data2);
    }

    public String[] getData() {
        return new String[] {obj1.getData(), obj2.getData()};
    }
}
