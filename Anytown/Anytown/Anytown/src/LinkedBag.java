public class LinkedBag implements BagInterface{

    private Node firstNode;
    private int numberOfEntries;

    public LinkedBag() {
        this.firstNode = null;
        this.numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    public boolean addNewEntry(Building newEntry) {
        return this.add(newEntry);
    }

    public boolean add(Building newEntry) {
        if (newEntry == null) {
            return false;
        }
        Node newNode = new Node(newEntry);
        newNode.setNext(this.firstNode);
        this.firstNode = newNode;
        this.numberOfEntries++;
        return true;
    }

    public Building remove() {
        if (this.firstNode == null) {
            return null;
        }
        Building result = this.firstNode.getData();
        this.firstNode = this.firstNode.getNext();
        this.numberOfEntries--;
        return result;
    }

    public boolean remove(Building anEntry) {
        if (anEntry == null) {
            return false;
        }

        Node currentNode = this.firstNode;
        Node previousNode = null;

        while (currentNode != null) {
            if (anEntry.equals(currentNode.getData())) {
                if (previousNode == null) {
                    this.firstNode = currentNode.getNext();
                } else {
                    previousNode.setNext(currentNode.getNext());
                }
                this.numberOfEntries--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void clear() {
        this.firstNode = null;
        this.numberOfEntries = 0;
    }

    public int getFrequencyOf(Building anEntry) {
        int count = 0;
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            if (anEntry != null && anEntry.equals(currentNode.getData())) {
                count++;
            }
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public boolean contains(Building anEntry) {
        return this.getFrequencyOf(anEntry) > 0;
    }

    public String toString() {
        String resultStr = "Bag [ \n";
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            resultStr += currentNode.getData() + "\n";
            currentNode = currentNode.getNext();
        }
        resultStr += "] \n";
        return resultStr;
    }
}
