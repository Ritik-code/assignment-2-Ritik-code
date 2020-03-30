
package problem4.main;

import problem4.bst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.insert(70);
        bst.insert(35);
        bst.insert(93);
        bst.insert(19);
        bst.insert(60);
        bst.insert(79);
        bst.insert(108);
        bst.insert(11);
        bst.insert(28);
        bst.insert(64);
        bst.insert(99);
        bst.insert(111);
        bst.insert(5);
        bst.insert(17);
        bst.insert(31);
        bst.insert(3);
        bst.insert(63);
        bst.insert(82);
        bst.insert(106);
        bst.insert(109);
        bst.insert(110);

        bst.printResultantQueue(70);
    }
}
