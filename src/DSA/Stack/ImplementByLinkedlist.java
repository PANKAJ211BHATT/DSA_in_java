package DSA.Stack;

public class ImplementByLinkedlist {
    static class Node{
        int data ;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class stack{
        Node head= null;
       
       //push
        public  void push(int data){
            Node Newnode = new Node(data);
            if(isEmpty()){
                head = Newnode;
            }
            Newnode.next =head;
            head = Newnode;
        }
        public  int pop(){
            if(head == null){
                throw new RuntimeException("stack is empty");
            }
            int data = head.data;
            head= head.next;
            return data;
        }
        public  int peek(){
            if(head == null){
                throw new RuntimeException("stack is empty");
            }
            return  head.data;
        }
        public boolean isEmpty() {
            return head == null;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(4);
        
        s.push(3);
        s.push(45);
        System.out.println(s.pop());
        
    }
}
