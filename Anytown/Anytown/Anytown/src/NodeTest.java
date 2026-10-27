public class NodeTest {

    public static void main (String[] args) {
        Node node1 = new Node( new Building("201 Main Street", "Mr X"));
        Node node2 = new Node( new Building( "202 Main Street", "Mr Y"));
        Node node3 = new Node( new Building( "203 Main Street", "Mr Z"));

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.printf("Node 1 is %s \n", node1.getData());
        System.out.printf("Node 2 is %s \n", node2.getNext().getData());
        System.out.printf("Node 3 is %s \n", node3.getNext().getNext().getData());

    }
}