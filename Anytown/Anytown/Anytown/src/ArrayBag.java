public class ArrayBag implements BagInterface {

    private Building[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public ArrayBag() {
        this(ArrayBag.DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be non-negative.");
        }
        this.bag = new Building[capacity];
        this.numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    public boolean isArrayFull() {
        return this.numberOfEntries >= this.bag.length;
    }

    public boolean addNewEntry(Building newEntry) {
        return this.add(newEntry);
    }

    public boolean add(Building newEntry) {
        if (newEntry == null) {
            return false;
        }
        if (this.numberOfEntries >= this.bag.length) {
            return false;
        }
        this.bag[this.numberOfEntries] = newEntry;
        this.numberOfEntries++;
        return true;
    }

    public Building remove() {
        if (this.numberOfEntries == 0) {
            return null;
        }
        Building result = this.bag[this.numberOfEntries - 1];
        this.bag[this.numberOfEntries - 1] = null;
        this.numberOfEntries--;
        return result;
    }

    public boolean remove(Building anEntry) {
        if (anEntry == null) {
            return false;
        }

        int index = this.getIndexOf(anEntry);
        if (index == -1) {
            return false;
        }

        this.bag[index] = this.bag[this.numberOfEntries - 1];
        this.bag[this.numberOfEntries - 1] = null;
        this.numberOfEntries--;
        return true;
    }

    public void clear() {
        for (int i = 0; i < this.numberOfEntries; i++) {
            this.bag[i] = null;
        }
        this.numberOfEntries = 0;
    }

    public int getFrequencyOf(Building anEntry) {
        int count = 0;
        for (int i = 0; i < this.numberOfEntries; i++) {
            if (anEntry != null && anEntry.equals(this.bag[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean contains(Building anEntry) {
        return this.getIndexOf(anEntry) >= 0;
    }

    public String toString() {
        StringBuilder strResult = new StringBuilder("Bag[\n");
        for (int i = 0; i < this.numberOfEntries; i++) {
            strResult.append(this.bag[i]).append("\n");
        }
        strResult.append("]");
        return strResult.toString();
    }

    private int getIndexOf(Building anEntry) {
        for (int i = 0; i < this.numberOfEntries; i++) {
            if (anEntry != null && anEntry.equals(this.bag[i])) {
                return i;
            }
        }
        return -1;
    }
}

