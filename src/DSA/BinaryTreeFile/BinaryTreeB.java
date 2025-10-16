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
        public static void Topview(Node root, int x){
            HashMap<Integer, Integer> map = new HashMap<>();
            Topviewhelper(root,x,map);
            for (Integer value : map.values()) {
                System.out.print(value +" ");
            }
        }
        public static void Topviewhelper(Node root , int x , HashMap map){
            if(root == null){
                return;
                }if(!map.containsKey(x)){
                    map.put(x,root.data);
                }
            Topviewhelper(root.left,x-1,map);
            
            Topviewhelper(root.right,x+1,map);
        }
        
        public static void kThlevelPrint(Node root, int k ){
            int i=0;
            Queue<Node> Q= new LinkedList<>();
            Q.add(root);
            Q.add(null);
            
            while(!Q.isEmpty()){
                Node current = Q.remove();
                
                if(current == null){
                    i++;
                    System.out.println();
                    if(Q.isEmpty()){
                        break;
                    }else{
                        Q.add(null);
                    }
                }else {
                    if (i == k) {
                        System.out.print(current.data + " ");
                    }
                    if (current.left != null) {
                        Q.add(current.left);
                    }
                    if (current.right != null) {
                        Q.add(current.right);
                    }
                }
            }
            
            
        }

        public static boolean getPath(Node root, int n, ArrayList<Integer> arr) {
            if (root == null) {
                return false;
            }
            arr.add(root.data);
            if (root.data == n) {
                return true;
            }

            if (getPath(root.left, n, arr) || getPath(root.right, n, arr)) {
                return true;
            }

            arr.remove(arr.size() - 1); // backtrack
            return false;
        }
        public int LCA(Node root , int n1, int n2){
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            getPath(root,n1,arr1);
            getPath(root,n2,arr2);
            int lac=0;
            int i = 0;
            while(arr1.get(i) == arr2.get(i)){
                lac = arr1.get(i);
                i++;
            }
            return lac;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       
        BinaryTree tree = new BinaryTree();
        Node root = tree.TreeBuilder(nodes);

        System.out.println(tree.LCA(root,4,5));
        

    }
}
