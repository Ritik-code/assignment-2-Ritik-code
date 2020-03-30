package problem3.linkedlist;

import problem3.node.Node;
import problem3.student.Student;

public class LinkedList {

    private Node head;
    private Node tail;

    public void insert(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            head.setNext(null);
            tail = head;
        } else {
            if (head.compareTo(student) > 0) {
                Node temp = head;
                Node previous = null;
                while (temp != null) {
                    if (temp.compareTo(student) < 0) {
                        break;
                    }
                    previous = temp;    // getting the node after which newNode need to be inserted
                    temp = temp.getNext();
                }
                assert previous != null;
                previous.setNext(newNode);
                newNode.setNext(temp);
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        }
    }

    public String deleteFromBeginning() {
        Node temp = head;
        if (temp == null) {
            return "Queue is empty.";
        }
        head = temp.getNext();
        temp.setNext(null);
        return temp.getData();
    }

    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}
