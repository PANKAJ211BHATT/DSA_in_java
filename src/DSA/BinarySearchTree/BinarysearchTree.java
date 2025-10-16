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

        public void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + "-->");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if(root == null){
                return ;
            }

            inorder(root.left);
            System.out.print(root.data + "-->");
            inorder(root.right);
        }
        public void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "-->");
        }
        }

        public static void main(String[] args) {
            BST tree = new BST();
            tree.insert(50);
            tree.insert(30);
            tree.insert(70);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(80);
            
            tree.inorder(tree.root);
        }
    
}
