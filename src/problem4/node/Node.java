package problem4.node;

public class Node {

    private int data;   // data that each node carries
    private Node next;  // pointer to next node

    // constructor
    public Node(int data) {
        this.data = data;
        next = null;    // initially next pointing to null
    }

    // getters and setters
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
