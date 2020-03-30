/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {

        MyPriorityQueue queue = new MyPriorityQueue();

        queue.insertInQueue(new Student("Amit", 34));
        queue.insertInQueue(new Student("Rahul", 12));
        queue.insertInQueue(new Student("Shikhar", 67));
        queue.insertInQueue(new Student("Satyam", 27));

        queue.printQueue();

        System.out.println(queue.deleteFromQueue());
        System.out.println(queue.deleteFromQueue());
        /*System.out.println(queue.deleteFromQueue());
        System.out.println(queue.deleteFromQueue());
        System.out.println(queue.deleteFromQueue());*/

        queue.insertInQueue(new Student("Rahul", 22));
        queue.insertInQueue(new Student("Manish", 19));
        queue.printQueue();
    }
}
