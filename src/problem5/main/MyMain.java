
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Arrays;

//executable class
public class MyMain {
    public static void main(String[] args) {

        MyCircularQueue circularQueue = new MyCircularQueue(5);

        circularQueue.insertInQueue(new Student("Ritik", 2, 0));
        circularQueue.insertInQueue(new Student("Stark", 1, 1));
        circularQueue.insertInQueue(new Student("Raj", 0, 0));
        circularQueue.insertInQueue(new Student("Robin", 2, 2));
        System.out.println(Arrays.toString(circularQueue.printQueue()));

        circularQueue.deleteFromQueue();
        circularQueue.deleteFromQueue();
        System.out.println(circularQueue.size());
        circularQueue.insertInQueue(new Student("Harsh", 1, 0));
        System.out.println(circularQueue.size());
        System.out.println(Arrays.toString(circularQueue.printQueue()));
    }
}
