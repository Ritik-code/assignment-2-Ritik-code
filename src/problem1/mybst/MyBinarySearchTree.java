
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            TreeNode temp = rootNode;
            TreeNode parentNode = null;
            while (temp != null) {
                parentNode = temp;
                if (node.getData() < temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            // setting child node
            if (node.getData() < parentNode.getData()) {
                parentNode.setLeft(node);
            } else {
                parentNode.setRight(node);
            }
        }
    }

    // will print all element in increasing order
    private void printTreeInOrder(TreeNode node) {
        if (node != null) {
            printTreeInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printTreeInOrder(node.getRight());
        }
    }

    public void printTree(TreeNode node) {
        System.out.print("Printing tree: ");
        printTreeInOrder(node);
    }

    int count;

    private void printingLeftChild(TreeNode node) {
        if (node != null) {

            // if node has left child
            if (node.getLeft() != null) {
                printingLeftChild(node.getLeft());
            } else {
                count++;
            }

            if (node != rootNode) {
                System.out.print(node.getData() + " ");
            }

            // if node has right child
            if (node.getRight() != null) {
                reachRightChild(node);
            }
        }
//        System.out.print("ok" + " ");
    }

    private void reachRightChild(TreeNode node) {
        node = node.getRight();
        if (node.getLeft() != null) {
            printingLeftChild(node.getLeft());
        } else {
            count++;
        }
        if (node.getRight() != null) {
            reachRightChild(node);
        }
//        System.out.print("works" + " ");
    }

    public void printLeftChildrenAndCount(TreeNode node) {
        count = 0;
        System.out.print("Printing the left children: ");
        printingLeftChild(node);
        System.out.println();
        System.out.println("Total the nodes with no left child: " + count);
        System.out.println();
    }

}
