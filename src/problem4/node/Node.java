package problem4.node;

public class Node {

    private int data;
    private Node next;

    // constructor
    public Node(int data) {
        this.data = data;
        next = null;
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
