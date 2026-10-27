public interface BagInterface {

    public int getCurrentSize();

    public boolean isEmpty();

    public boolean add(Building newEntry);

    public Building remove();

    public boolean remove (Building anEntry);

    public void clear();

    public int getFrequencyOf(Building anEntry);

    public boolean contains(Building anEntry);

    public String toString();



}
