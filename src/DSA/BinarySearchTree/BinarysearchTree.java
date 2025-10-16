package DSA.BinarySearchTree;

import DSA.BinaryTreeFile.BinaryTreeB;

public class BinarysearchTree {
    static class Node{
        int data;
        BinarysearchTree.Node left;
        BinarysearchTree.Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BST{
        Node root;

        public BST() {
            root = null;
        }

        void insert(int value) {
            root = insertRec(root, value);
        }

        Node insertRec(Node root, int value) {
            // Base case: empty tree
            if (root == null) {
                root = new Node(value);
                return root;
            }

            // Otherwise, recur down the tree
            if (value < root.data)
                root.left = insertRec(root.left, value);
            else if (value > root.data)
                root.right = insertRec(root.right, value);

            // return the unchanged node pointer
            return root;
        }
        
       
    }
}
