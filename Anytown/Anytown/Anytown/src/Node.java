public class Node {

    private Building data;
    private Node next;

    public Node(Building dataValue) {
        this.data = dataValue;
        this.next = null;
    }

    public Building getData() {
        return this.data;
    }

    public void setData (Building dataValue) {
        this.data = dataValue;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
