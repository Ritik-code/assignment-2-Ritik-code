
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();

        tree.insert(70);
        tree.insert(35);
        tree.insert(93);
        tree.insert(19);
        tree.insert(60);
        tree.insert(79);
        tree.insert(108);
        tree.insert(11);
        tree.insert(28);
        tree.insert(64);
        tree.insert(99);
        tree.insert(111);
        //tree.printTree(tree.getRootNode());

        tree.printLeftChildrenAndCount(tree.getRootNode());

        tree.insert(5);
        tree.insert(17);
        tree.insert(31);
        tree.insert(3);
        tree.insert(63);
        tree.insert(82);
        tree.insert(106);
        tree.insert(109);
        tree.insert(110);
        tree.printLeftChildrenAndCount(tree.getRootNode());
    }
}
