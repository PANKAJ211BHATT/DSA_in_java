package DSA.BinaryTreeFile;

import java.util.*;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right; 
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        int idx = -1;
        public Node TreeBuilder(int[] nodes){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = TreeBuilder(nodes);
            newNode.right = TreeBuilder(nodes);
            return newNode;
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
        public void levelOrder(Node root){
            //Queue bnaye 
            Queue<Node> Q= new LinkedList<>();
            //Queue main root add kra aur ek null bhi
            Q.add(root);
            Q.add(null);
            
            //jab tak queue empty ni hota
            while(!Q.isEmpty()){
                // ek ek karke node nikla
                Node current = Q.remove();
                
                //check kra ki node null h ya nhi 
                if(current == null){
                    //ager h toh ek line chor de 
                    System.out.println();
                    // fir check kra q empty h ya nhi ager h toh
                    // iska matlb aur koi element nhi bacha tree main toh break kardo
                    if(Q.isEmpty()){
                        break;
                    }
                    // ager queue empty nhi h toh null ko firse queue main add krdo 
                    else{
                        Q.add(null);
                    }
                    
                }
                //ager current element null hi nhi h 
                 else{
                     // print kardo element ko 
                    System.out.print(current.data + " ");

                    //ager current element ka left aur
                    // right null nhi h toh add krdo queue main
                    
                    if(current.left != null){
                        Q.add(current.left);
                    }
                    if(current.right != null){
                        Q.add(current.right);
                    }
                }
            }
            
            
        }
        
        public int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
           return 1+Math.max(heightOfTree(root.left) , heightOfTree(root.right));
        }
        public int NumberofNodes(Node root){
            if(root == null){
                return 0; 
            }
            return 1+NumberofNodes(root.left)+NumberofNodes(root.right);
        }
        public int SumofNodes(Node root){
            if(root == null){
                return 0;
            }
            return root.data + SumofNodes(root.left)+SumofNodes(root.right);
        }
        public static boolean Isidenticall(Node root , Node subroot){
            if(root ==null && subroot == null){
                return true;
            } else if (root == null || subroot == null || subroot.data != root.data) {
                return false;
            }
         return Isidenticall(root.right, subroot.right) && Isidenticall(root.left , subroot.left);
        }
        public static boolean subtreePresent(Node root , Node subroot){

            if (root == null) {
                return false;
            }
            if(root.data == subroot.data){
               
                if(Isidenticall( root , subroot)){
                   return true;
               }
           }
            return subtreePresent(root.left,subroot) || subtreePresent(root.right,subroot);
            
        }
        
    }
    
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       
        BinaryTree tree = new BinaryTree();
        Node root = tree.TreeBuilder(nodes);
        tree.levelOrder(root);

        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);
        
            System.out.println(BinaryTree.subtreePresent(root,subTree));

        
      

    }
}
