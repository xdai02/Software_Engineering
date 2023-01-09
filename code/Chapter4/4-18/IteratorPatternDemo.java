public class IteratorPatternDemo {
    public static void main(String[] args) {
        String[] data = {"data1", "data2", "data3", "data4"};
        ArrayContainer arrayContainer = new ArrayContainer(data);
        Iterator iter = arrayContainer.getIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
