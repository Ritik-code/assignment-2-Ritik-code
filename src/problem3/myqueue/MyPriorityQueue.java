
package problem3.myqueue;

import problem3.linkedlist.LinkedList;
import problem3.student.Student;

public class MyPriorityQueue {

    LinkedList linkedList = new LinkedList();

    public void insertInQueue(Student student) {
        linkedList.insert(student);
    }

    public String deleteFromQueue() {
        return linkedList.deleteFromBeginning();
    }

    public void printQueue() {
        System.out.print("Printing the queue: ");
        linkedList.printData();
        System.out.println();
    }
}
