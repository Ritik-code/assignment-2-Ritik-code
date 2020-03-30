
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

public class MyMain {
    public static void main(String[] args) {

        MyPriorityQueue queue = new MyPriorityQueue();

        queue.insertInQueue(new Student("Ritik", 34));
        queue.insertInQueue(new Student("Stark", 12));
        queue.insertInQueue(new Student("Shivam", 67));
        queue.insertInQueue(new Student("Raghav", 27));

        queue.printQueue();

        System.out.println(queue.deleteFromQueue());
        System.out.println(queue.deleteFromQueue());

        queue.insertInQueue(new Student("Tony", 22));
        queue.insertInQueue(new Student("Mony", 19));
        queue.printQueue();
    }
}
