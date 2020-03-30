/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.node.Node;

public class MyQueue {

    private Node front;
    private Node rear;  // point to the last element of queue
    private int size;

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // due to no limitation of size, element will always be added
    public void insertInQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {    // means no array exists till now
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = rear.getNext();
        }
        size++;
    }

    public int deleteFromQueue() {
        int response = -1;
        if (front == null) {
            System.out.println("Queue is empty.");
        } else if (front.getNext() == null) {   // if queue size is 1
            response = front.getData();
            front = null;
            rear = null;
            size--;
        } else {
            response = front.getData();
            front = front.getNext();
            size--;
        }
        return response;
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("No queue to print.");
        } else {
            System.out.print("Printing Queue: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("-->");
                }
            }
            System.out.println();
        }
    }
}
