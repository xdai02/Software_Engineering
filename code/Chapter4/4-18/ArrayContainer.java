public class ArrayContainer {
    private Object[] data;

    private class ArrayIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return data[index++];
            }
            return null;
        }
    }

    public ArrayContainer(Object[] data) {
        this.data = data;
    }

    public Iterator getIterator() {
        return new ArrayIterator();
    }
}
